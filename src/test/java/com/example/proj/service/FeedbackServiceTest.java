package com.example.proj.service;

import com.example.proj.model.Feedback;
import com.example.proj.repository.FeedbackRepository;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FeedbackServiceTest {

    private final FeedbackRepository repository = mock(FeedbackRepository.class);
    private final FeedbackService service = new FeedbackService(repository);

    @Test
    void testSaveFeedback() {
        Feedback feedback = new Feedback();
        feedback.setName("John Doe");
        feedback.setEmail("john@example.com");
        feedback.setMessage("This is a sample message.");

        when(repository.save(feedback)).thenReturn(feedback);

        Feedback saved = service.saveFeedback(feedback);

        assertNotNull(saved);
        assertEquals("John Doe", saved.getName());
        verify(repository, times(1)).save(feedback);
    }

    @Test
    void testGetAllFeedback() {
        List<Feedback> feedbackList = List.of(new Feedback(), new Feedback());
        when(repository.findAll()).thenReturn(feedbackList);

        List<Feedback> result = service.getAllFeedback();

        assertEquals(2, result.size());
        verify(repository, times(1)).findAll();
    }
}

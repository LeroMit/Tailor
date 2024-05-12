package org.tailor.api.tailorback.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tailor.api.tailorback.models.Comment;

public interface CommentsRepository extends JpaRepository<Comment, Long> {
}

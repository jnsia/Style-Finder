package com.d111.backend.service.feed;

import com.d111.backend.dto.coordi.request.CoordiCreateRequest;
import com.d111.backend.dto.feed.request.FeedCreateRequest;
import com.d111.backend.dto.feed.request.FeedUpdateRequest;
import com.d111.backend.dto.feed.request.FittingRequest;
import com.d111.backend.dto.feed.response.*;
import com.d111.backend.entity.user.User;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

public interface FeedService {

    ResponseEntity<FeedCreateResponse> create(FeedCreateRequest feedCreateRequest, CoordiCreateRequest coordiCreateRequest, MultipartFile feedThumbnail);

    ResponseEntity<FeedListReadResponse> readList(Pageable pageable);

    ResponseEntity<FeedReadResponse> read(Long feedId);

    ResponseEntity<FeedDeleteResponse> delete(Long feedId);

    ResponseEntity<?> feedLikes(Long feedId);

    ResponseEntity<FeedUpdateResponse> update(Long feedId, FeedUpdateRequest request, MultipartFile multipartFile);

    ResponseEntity<FeedListReadResponse> readPopularList(Pageable pageable);


    ResponseEntity<FeedListReadResponse> searchByTitle(String title, Pageable pageable);

    ResponseEntity<FeedListReadResponse> searchMyFeed(Optional<User> userId, Pageable pageable);

    ResponseEntity<?> fitting(FittingRequest fittingRequest, Long feedId);
}



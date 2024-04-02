package com.d111.backend.dto.recommend.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LowerBodyResponseDTO {

    private byte[] image;

    private String imageUrl;

    private String style;

    private String category;

    private String color;

}

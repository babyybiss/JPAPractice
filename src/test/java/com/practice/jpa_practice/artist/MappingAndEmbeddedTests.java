package com.practice.jpa_practice.artist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.stream.Stream;

@SpringBootTest
public class MappingAndEmbeddedTests {

    @Autowired
    private ArtistService artistService;

    private static Stream<Arguments> createArtist() {
        return Stream.of(
                Arguments.of(
                  1,
                        "Ariana Grande",
                        "22",
                        LocalDate.now(),
                        "POP",
                        13,
                        503000000,
                        0.377
                )
        );
    }

    @DisplayName("JPA로 테이블 생성 테스트")
    @ParameterizedTest
    @MethodSource("createArtist")
    void creatingArtistTest(int artistNo, String name, int age, LocalDate debutDate,
                            Genre genre, int totalAlbums, int beforeTaxNetWorth, double tax) {

        ArtistDTO artistInfo = new ArtistDTO(
                name,
                age,
                debutDate,
                genre,
                totalAlbums,
                beforeTaxNetWorth,
                tax
        );

        Assertions.assertDoesNotThrow(
                () -> artistService.registArtist(artistInfo)
        );

    }
}

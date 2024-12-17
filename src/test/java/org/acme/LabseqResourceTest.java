package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class LabseqResourceTest {
    @Test
    void testLabSeqEndpoint() {
        given()
                .when().get("/labseq/10")
                .then()
                .statusCode(200)
                .body("value", is(3));
    }

    @Test
    void testLabSeqInvalidInput(){
        given()
            .when().get("/labseq/-1")
            .then()
            .statusCode(404);
    }
}
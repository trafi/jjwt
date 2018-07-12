package io.jsonwebtoken.io

import org.junit.Test

import static org.junit.Assert.*

class DecodersTest {

    @Test
    void testBase64() {
        assertTrue Decoders.BASE64 instanceof ExceptionPropagatingDecoder
        assertTrue Decoders.BASE64.decoder instanceof Base64Decoder
    }

    @Test
    void testBase64Url() {
        assertTrue Decoders.BASE64URL instanceof ExceptionPropagatingDecoder
        assertTrue Decoders.BASE64URL.decoder instanceof Base64UrlDecoder
    }

}

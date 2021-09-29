package com.clonecoding.gccoffee.util;

import java.nio.ByteBuffer;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.UUID;

public class JdbcUtils {

    public static UUID toUUID(final byte[] bytes) {
        final var byteBuffer = ByteBuffer.wrap(bytes);
        return new UUID(byteBuffer.getLong(), byteBuffer.getLong());
    }

    public static LocalDateTime toLocalDateTime(final Timestamp timestamp) {
        return timestamp != null ? timestamp.toLocalDateTime() : null;
    }

}

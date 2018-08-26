package retrofit2.converter.file;

import java.io.File;
import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Converter;

final class FileRequestBodyConverter implements Converter<File, RequestBody> {

    private static final MediaType MEDIA_TYPE = MediaType.parse("application/json; charset=UTF-8");

    public FileRequestBodyConverter() {

    }

    @Override
    public RequestBody convert(File value) throws IOException {
        return RequestBody.create(MEDIA_TYPE, value);
    }
}
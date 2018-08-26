package retrofit2.converter.file;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;

final class FileResponseBodyConvert<T> implements Converter<ResponseBody, T> {

    private Type type;

    public FileResponseBodyConvert(Type type) {
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {

        return null;
    }

}
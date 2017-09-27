package br.com.liveo.mvp.data.source.remote;

import br.com.liveo.mvp.model.domain.UserResponse;
import io.reactivex.Observable;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rudsonlima on 8/29/17.
 */

public interface ApiEndPoint {

    @GET("api/users")
    Single<UserResponse> fetchUsers(@Query("page") int page);
}

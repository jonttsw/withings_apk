package com.withings.favorite.api;

import com.withings.favorite.model.webservice.WsBookmarkResponse;
import com.withings.favorite.model.webservice.WsBookmarksParam;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
/* compiled from: BookmarkRetrofit1Api.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\u000b¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withings/favorite/api/BookmarkRetrofit1Api;", "", "", NavigationArguments.USER_ID, "lastUpdate", "Lcom/withings/favorite/model/webservice/WsBookmarkResponse;", "getBookmarks", "(JJ)Lcom/withings/favorite/model/webservice/WsBookmarkResponse;", "Lcom/withings/favorite/model/webservice/WsBookmarksParam;", "favorites", "addBookmarks", "(JLcom/withings/favorite/model/webservice/WsBookmarksParam;)Ljava/lang/Object;", "deleteBookmarks", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface BookmarkRetrofit1Api {
    @POST("/v2/bookmark?action=add")
    @FormUrlEncoded
    Object addBookmarks(@Field("userid") long j5, @Field("bookmarks") WsBookmarksParam wsBookmarksParam) throws Exception;

    @POST("/v2/bookmark?action=delete")
    @FormUrlEncoded
    Object deleteBookmarks(@Field("userid") long j5, @Field("bookmarks") WsBookmarksParam wsBookmarksParam) throws Exception;

    @GET("/v2/bookmark?action=list")
    WsBookmarkResponse getBookmarks(@Query("userid") long j5, @Query("lastupdate") long j11);
}

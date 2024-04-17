package com.withings.healthplus.library.android.webservice;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import fv.e;
import fv.f;
import fv.g;
import kotlin.Metadata;
import retrofit.http.GET;
import retrofit.http.Query;
/* compiled from: LibraryRetrofit1Api.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006JG\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/healthplus/library/android/webservice/LibraryRetrofit1Api;", "", "", NavigationArguments.USER_ID, "Lfv/e;", "getLibraryFilters", "(J)Lfv/e;", "", "type", "", "filter", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "limit", "Lfv/f;", "getLibraryContent", "(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lfv/f;", "Lfv/g;", "getSuggestedTasks", "(J)Lfv/g;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface LibraryRetrofit1Api {
    @GET("/v2/wellnesslibrary?action=search")
    f getLibraryContent(@Query("userid") long j5, @Query("type") String str, @Query("tagid") Integer num, @Query("offset") Integer num2, @Query("limit") Integer num3);

    @GET("/v2/wellnesslibrary?action=listtags")
    e getLibraryFilters(@Query("userid") long j5);

    @GET("/v2/wellnesslibrary?action=listsuggestedtasks")
    g getSuggestedTasks(@Query("userid") long j5) throws Exception;
}

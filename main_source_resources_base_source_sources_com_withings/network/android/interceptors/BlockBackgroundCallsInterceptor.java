package com.withings.network.android.interceptors;

import kotlin.Metadata;
import okhttp3.Interceptor;
import retrofit.RequestInterceptor;
/* compiled from: BlockBackgroundCallsInterceptor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u00012\u00020\u0002J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withings/network/android/interceptors/BlockBackgroundCallsInterceptor;", "Lretrofit/RequestInterceptor;", "Lokhttp3/Interceptor;", "", "seconds", "Lcom/withings/network/android/interceptors/BlockMetaData;", "metaData", "Lnm0/y;", "blockCallsForSeconds", "(ILcom/withings/network/android/interceptors/BlockMetaData;)V", "stopBlockingCalls", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface BlockBackgroundCallsInterceptor extends RequestInterceptor, Interceptor {
    void blockCallsForSeconds(int i11, BlockMetaData blockMetaData);

    void stopBlockingCalls();
}

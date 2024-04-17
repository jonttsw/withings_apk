package com.withings.webservices.legacy.common.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AlreadyExistsException.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/webservices/legacy/common/exception/Response;", "", "activity", "Lcom/withings/webservices/legacy/common/exception/AlreadyExistInfo;", "(Lcom/withings/webservices/legacy/common/exception/AlreadyExistInfo;)V", "getActivity", "()Lcom/withings/webservices/legacy/common/exception/AlreadyExistInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Response {
    private final AlreadyExistInfo activity;

    public Response(AlreadyExistInfo alreadyExistInfo) {
        this.activity = alreadyExistInfo;
    }

    public static /* synthetic */ Response copy$default(Response response, AlreadyExistInfo alreadyExistInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            alreadyExistInfo = response.activity;
        }
        return response.copy(alreadyExistInfo);
    }

    public final AlreadyExistInfo component1() {
        return this.activity;
    }

    public final Response copy(AlreadyExistInfo alreadyExistInfo) {
        return new Response(alreadyExistInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Response) && u.e(this.activity, ((Response) obj).activity)) {
            return true;
        }
        return false;
    }

    public final AlreadyExistInfo getActivity() {
        return this.activity;
    }

    public int hashCode() {
        AlreadyExistInfo alreadyExistInfo = this.activity;
        if (alreadyExistInfo == null) {
            return 0;
        }
        return alreadyExistInfo.hashCode();
    }

    public String toString() {
        AlreadyExistInfo alreadyExistInfo = this.activity;
        return "Response(activity=" + alreadyExistInfo + ")";
    }
}

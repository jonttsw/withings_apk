package com.withings.sdk.wilife.data.update.remote;

import androidx.fragment.app.o;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ErrorResponse.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/sdk/wilife/data/update/remote/ErrorResponse;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "wilife-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ErrorResponse {
    private final String message;

    public ErrorResponse(String message) {
        u.j(message, "message");
        this.message = message;
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = errorResponse.message;
        }
        return errorResponse.copy(str);
    }

    public final String component1() {
        return this.message;
    }

    public final ErrorResponse copy(String message) {
        u.j(message, "message");
        return new ErrorResponse(message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ErrorResponse) && u.e(this.message, ((ErrorResponse) obj).message)) {
            return true;
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public String toString() {
        return o.d("ErrorResponse(message=", this.message, ")");
    }
}

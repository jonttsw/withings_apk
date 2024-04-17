package com.withings.health.score.android.webservices.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ScoresWs.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/health/score/android/webservices/model/BatchStoreResponsesWs;", "", "errors", "", "Lcom/withings/health/score/android/webservices/model/BatchStoreResponse;", "modified", "", "(Ljava/util/List;J)V", "getErrors", "()Ljava/util/List;", "getModified", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatchStoreResponsesWs {
    private final List<BatchStoreResponse> errors;
    private final long modified;

    public BatchStoreResponsesWs(List<BatchStoreResponse> errors, long j5) {
        u.j(errors, "errors");
        this.errors = errors;
        this.modified = j5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchStoreResponsesWs copy$default(BatchStoreResponsesWs batchStoreResponsesWs, List list, long j5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = batchStoreResponsesWs.errors;
        }
        if ((i11 & 2) != 0) {
            j5 = batchStoreResponsesWs.modified;
        }
        return batchStoreResponsesWs.copy(list, j5);
    }

    public final List<BatchStoreResponse> component1() {
        return this.errors;
    }

    public final long component2() {
        return this.modified;
    }

    public final BatchStoreResponsesWs copy(List<BatchStoreResponse> errors, long j5) {
        u.j(errors, "errors");
        return new BatchStoreResponsesWs(errors, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchStoreResponsesWs)) {
            return false;
        }
        BatchStoreResponsesWs batchStoreResponsesWs = (BatchStoreResponsesWs) obj;
        if (u.e(this.errors, batchStoreResponsesWs.errors) && this.modified == batchStoreResponsesWs.modified) {
            return true;
        }
        return false;
    }

    public final List<BatchStoreResponse> getErrors() {
        return this.errors;
    }

    public final long getModified() {
        return this.modified;
    }

    public int hashCode() {
        return Long.hashCode(this.modified) + (this.errors.hashCode() * 31);
    }

    public String toString() {
        List<BatchStoreResponse> list = this.errors;
        long j5 = this.modified;
        return "BatchStoreResponsesWs(errors=" + list + ", modified=" + j5 + ")";
    }
}

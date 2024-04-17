package com.withings.manualLogging.data.webservice.note;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import sm0.a;
import sm0.b;
/* compiled from: DeleteResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/DeleteResponse;", "", "status", "", "requestId", "", "(ILjava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Status", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DeleteResponse {
    @SerializedName("requestid")
    private final String requestId;
    @SerializedName("status")
    private final int status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DeleteResponse.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/DeleteResponse$Status;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "Success", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Status {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status Success = new Status("Success", 0, 0);
        private final int value;

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{Success};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i11, int i12) {
            this.value = i12;
        }

        public static a<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    public DeleteResponse(int i11, String requestId) {
        u.j(requestId, "requestId");
        this.status = i11;
        this.requestId = requestId;
    }

    public static /* synthetic */ DeleteResponse copy$default(DeleteResponse deleteResponse, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = deleteResponse.status;
        }
        if ((i12 & 2) != 0) {
            str = deleteResponse.requestId;
        }
        return deleteResponse.copy(i11, str);
    }

    public final int component1() {
        return this.status;
    }

    public final String component2() {
        return this.requestId;
    }

    public final DeleteResponse copy(int i11, String requestId) {
        u.j(requestId, "requestId");
        return new DeleteResponse(i11, requestId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteResponse)) {
            return false;
        }
        DeleteResponse deleteResponse = (DeleteResponse) obj;
        if (this.status == deleteResponse.status && u.e(this.requestId, deleteResponse.requestId)) {
            return true;
        }
        return false;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.requestId.hashCode() + (Integer.hashCode(this.status) * 31);
    }

    public String toString() {
        int i11 = this.status;
        String str = this.requestId;
        return "DeleteResponse(status=" + i11 + ", requestId=" + str + ")";
    }
}

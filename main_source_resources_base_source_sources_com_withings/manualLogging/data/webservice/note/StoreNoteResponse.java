package com.withings.manualLogging.data.webservice.note;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: StoreNoteResponse.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0003J?\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/StoreNoteResponse;", "", "medicineNotes", "", "Lcom/withings/manualLogging/data/webservice/note/WebServiceHealthAttributeNote;", "symptomNotes", "commentNotes", "Lcom/withings/manualLogging/data/webservice/note/WebServiceCommentNote;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getCommentNotes", "()Ljava/util/List;", "getMedicineNotes", "getSymptomNotes", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StoreNoteResponse {
    @SerializedName("texts")
    private final List<WebServiceCommentNote> commentNotes;
    @SerializedName("medicines")
    private final List<WebServiceHealthAttributeNote> medicineNotes;
    @SerializedName("symptoms")
    private final List<WebServiceHealthAttributeNote> symptomNotes;

    public StoreNoteResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoreNoteResponse copy$default(StoreNoteResponse storeNoteResponse, List list, List list2, List list3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = storeNoteResponse.medicineNotes;
        }
        if ((i11 & 2) != 0) {
            list2 = storeNoteResponse.symptomNotes;
        }
        if ((i11 & 4) != 0) {
            list3 = storeNoteResponse.commentNotes;
        }
        return storeNoteResponse.copy(list, list2, list3);
    }

    public final List<WebServiceHealthAttributeNote> component1() {
        return this.medicineNotes;
    }

    public final List<WebServiceHealthAttributeNote> component2() {
        return this.symptomNotes;
    }

    public final List<WebServiceCommentNote> component3() {
        return this.commentNotes;
    }

    public final StoreNoteResponse copy(List<WebServiceHealthAttributeNote> list, List<WebServiceHealthAttributeNote> list2, List<WebServiceCommentNote> list3) {
        return new StoreNoteResponse(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoreNoteResponse)) {
            return false;
        }
        StoreNoteResponse storeNoteResponse = (StoreNoteResponse) obj;
        if (u.e(this.medicineNotes, storeNoteResponse.medicineNotes) && u.e(this.symptomNotes, storeNoteResponse.symptomNotes) && u.e(this.commentNotes, storeNoteResponse.commentNotes)) {
            return true;
        }
        return false;
    }

    public final List<WebServiceCommentNote> getCommentNotes() {
        return this.commentNotes;
    }

    public final List<WebServiceHealthAttributeNote> getMedicineNotes() {
        return this.medicineNotes;
    }

    public final List<WebServiceHealthAttributeNote> getSymptomNotes() {
        return this.symptomNotes;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List<WebServiceHealthAttributeNote> list = this.medicineNotes;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i12 = hashCode * 31;
        List<WebServiceHealthAttributeNote> list2 = this.symptomNotes;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        List<WebServiceCommentNote> list3 = this.commentNotes;
        if (list3 != null) {
            i11 = list3.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        List<WebServiceHealthAttributeNote> list = this.medicineNotes;
        List<WebServiceHealthAttributeNote> list2 = this.symptomNotes;
        List<WebServiceCommentNote> list3 = this.commentNotes;
        StringBuilder sb2 = new StringBuilder("StoreNoteResponse(medicineNotes=");
        sb2.append(list);
        sb2.append(", symptomNotes=");
        sb2.append(list2);
        sb2.append(", commentNotes=");
        return d.i(sb2, list3, ")");
    }

    public StoreNoteResponse(List<WebServiceHealthAttributeNote> list, List<WebServiceHealthAttributeNote> list2, List<WebServiceCommentNote> list3) {
        this.medicineNotes = list;
        this.symptomNotes = list2;
        this.commentNotes = list3;
    }

    public /* synthetic */ StoreNoteResponse(List list, List list2, List list3, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? null : list3);
    }
}

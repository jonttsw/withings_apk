package com.withings.medicalreport.model;

import androidx.fragment.app.o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: CompressedPdf.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/medicalreport/model/CompressedPdf;", "", "pdfData", "", "(Ljava/lang/String;)V", "getPdfData", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "medicalreport_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CompressedPdf {
    public static final int $stable = 0;
    @SerializedName("data")
    private final String pdfData;

    public CompressedPdf(String pdfData) {
        u.j(pdfData, "pdfData");
        this.pdfData = pdfData;
    }

    public static /* synthetic */ CompressedPdf copy$default(CompressedPdf compressedPdf, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = compressedPdf.pdfData;
        }
        return compressedPdf.copy(str);
    }

    public final String component1() {
        return this.pdfData;
    }

    public final CompressedPdf copy(String pdfData) {
        u.j(pdfData, "pdfData");
        return new CompressedPdf(pdfData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CompressedPdf) && u.e(this.pdfData, ((CompressedPdf) obj).pdfData)) {
            return true;
        }
        return false;
    }

    public final String getPdfData() {
        return this.pdfData;
    }

    public int hashCode() {
        return this.pdfData.hashCode();
    }

    public String toString() {
        return o.d("CompressedPdf(pdfData=", this.pdfData, ")");
    }
}

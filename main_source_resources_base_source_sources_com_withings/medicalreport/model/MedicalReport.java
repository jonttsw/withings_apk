package com.withings.medicalreport.model;

import androidx.camera.camera2.internal.o0;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: MedicalReport.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/medicalreport/model/MedicalReport;", "", "()V", "Pdf", "PdfDelayed", "Lcom/withings/medicalreport/model/MedicalReport$Pdf;", "Lcom/withings/medicalreport/model/MedicalReport$PdfDelayed;", "medicalreport_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MedicalReport {
    public static final int $stable = 0;

    /* compiled from: MedicalReport.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/withings/medicalreport/model/MedicalReport$Pdf;", "Lcom/withings/medicalreport/model/MedicalReport;", "compressedPdf", "Lcom/withings/medicalreport/model/CompressedPdf;", "(Lcom/withings/medicalreport/model/CompressedPdf;)V", "getCompressedPdf", "()Lcom/withings/medicalreport/model/CompressedPdf;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "medicalreport_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Pdf extends MedicalReport {
        public static final int $stable = 0;
        @SerializedName("medicalreport")
        private final CompressedPdf compressedPdf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pdf(CompressedPdf compressedPdf) {
            super(null);
            u.j(compressedPdf, "compressedPdf");
            this.compressedPdf = compressedPdf;
        }

        public static /* synthetic */ Pdf copy$default(Pdf pdf, CompressedPdf compressedPdf, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                compressedPdf = pdf.compressedPdf;
            }
            return pdf.copy(compressedPdf);
        }

        public final CompressedPdf component1() {
            return this.compressedPdf;
        }

        public final Pdf copy(CompressedPdf compressedPdf) {
            u.j(compressedPdf, "compressedPdf");
            return new Pdf(compressedPdf);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Pdf) && u.e(this.compressedPdf, ((Pdf) obj).compressedPdf)) {
                return true;
            }
            return false;
        }

        public final CompressedPdf getCompressedPdf() {
            return this.compressedPdf;
        }

        public int hashCode() {
            return this.compressedPdf.hashCode();
        }

        public String toString() {
            CompressedPdf compressedPdf = this.compressedPdf;
            return "Pdf(compressedPdf=" + compressedPdf + ")";
        }
    }

    /* compiled from: MedicalReport.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/medicalreport/model/MedicalReport$PdfDelayed;", "Lcom/withings/medicalreport/model/MedicalReport;", "waitSeconds", "", "(I)V", "getWaitSeconds", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "medicalreport_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PdfDelayed extends MedicalReport {
        public static final int $stable = 0;
        @SerializedName("wait_seconds")
        private final int waitSeconds;

        public PdfDelayed(int i11) {
            super(null);
            this.waitSeconds = i11;
        }

        public static /* synthetic */ PdfDelayed copy$default(PdfDelayed pdfDelayed, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = pdfDelayed.waitSeconds;
            }
            return pdfDelayed.copy(i11);
        }

        public final int component1() {
            return this.waitSeconds;
        }

        public final PdfDelayed copy(int i11) {
            return new PdfDelayed(i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof PdfDelayed) && this.waitSeconds == ((PdfDelayed) obj).waitSeconds) {
                return true;
            }
            return false;
        }

        public final int getWaitSeconds() {
            return this.waitSeconds;
        }

        public int hashCode() {
            return Integer.hashCode(this.waitSeconds);
        }

        public String toString() {
            return o0.a("PdfDelayed(waitSeconds=", this.waitSeconds, ")");
        }
    }

    public /* synthetic */ MedicalReport(m mVar) {
        this();
    }

    private MedicalReport() {
    }
}

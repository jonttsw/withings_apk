package com.withings.library.ecg.diag;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: AfibStatus.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/withings/library/ecg/diag/AfibStatus;", "", "cValue", "", "(Ljava/lang/String;II)V", "getCValue", "()I", "AFIB_UNDEFINED", "AFIB_NOT_PROCESSED", "AFIB_NEGATIVE", "AFIB_POSITIVE", "AFIB_INCONCLUSIVE", "AFIB_NO_SIGNAL", "AFIB_OTHER", "AFIB_NOISE", "AFIB_LOW_HEART_RATE", "AFIB_HIGH_HEART_RATE", "Companion", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum AfibStatus {
    AFIB_UNDEFINED(-2),
    AFIB_NOT_PROCESSED(-1),
    AFIB_NEGATIVE(0),
    AFIB_POSITIVE(1),
    AFIB_INCONCLUSIVE(2),
    AFIB_NO_SIGNAL(3),
    AFIB_OTHER(4),
    AFIB_NOISE(5),
    AFIB_LOW_HEART_RATE(6),
    AFIB_HIGH_HEART_RATE(7);
    
    public static final Companion Companion = new Companion(null);
    private final int cValue;

    /* compiled from: AfibStatus.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/withings/library/ecg/diag/AfibStatus$Companion;", "", "()V", "fromInt", "Lcom/withings/library/ecg/diag/AfibStatus;", "value", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final AfibStatus fromInt(int i11) {
            AfibStatus afibStatus;
            AfibStatus[] values = AfibStatus.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 < length) {
                    afibStatus = values[i12];
                    if (afibStatus.getCValue() == i11) {
                        break;
                    }
                    i12++;
                } else {
                    afibStatus = null;
                    break;
                }
            }
            if (afibStatus == null) {
                return AfibStatus.AFIB_UNDEFINED;
            }
            return afibStatus;
        }

        private Companion() {
        }
    }

    AfibStatus(int i11) {
        this.cValue = i11;
    }

    public static final AfibStatus fromInt(int i11) {
        return Companion.fromInt(i11);
    }

    public final int getCValue() {
        return this.cValue;
    }
}

package com.withings.nervehealthscore;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NHSProcessResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withings/nervehealthscore/NHSProcessResult;", "", "ErrorAllocationFailed", "ErrorNoMeasures", "Success", "Lcom/withings/nervehealthscore/NHSProcessResult$ErrorAllocationFailed;", "Lcom/withings/nervehealthscore/NHSProcessResult$ErrorNoMeasures;", "Lcom/withings/nervehealthscore/NHSProcessResult$Success;", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface NHSProcessResult {

    /* compiled from: NHSProcessResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/nervehealthscore/NHSProcessResult$ErrorAllocationFailed;", "Lcom/withings/nervehealthscore/NHSProcessResult;", "()V", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ErrorAllocationFailed implements NHSProcessResult {
        public static final ErrorAllocationFailed INSTANCE = new ErrorAllocationFailed();

        private ErrorAllocationFailed() {
        }
    }

    /* compiled from: NHSProcessResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/nervehealthscore/NHSProcessResult$ErrorNoMeasures;", "Lcom/withings/nervehealthscore/NHSProcessResult;", "()V", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ErrorNoMeasures implements NHSProcessResult {
        public static final ErrorNoMeasures INSTANCE = new ErrorNoMeasures();

        private ErrorNoMeasures() {
        }
    }

    /* compiled from: NHSProcessResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/withings/nervehealthscore/NHSProcessResult$Success;", "Lcom/withings/nervehealthscore/NHSProcessResult;", "diagnostics", "", "Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative;", "([Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative;)V", "getDiagnostics", "()[Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative;", "[Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative;", "component1", "copy", "([Lcom/withings/nervehealthscore/NeuropathyDiagnosticNative;)Lcom/withings/nervehealthscore/NHSProcessResult$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "nervehealthscore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Success implements NHSProcessResult {
        private final NeuropathyDiagnosticNative[] diagnostics;

        public Success(NeuropathyDiagnosticNative[] diagnostics) {
            u.j(diagnostics, "diagnostics");
            this.diagnostics = diagnostics;
        }

        public static /* synthetic */ Success copy$default(Success success, NeuropathyDiagnosticNative[] neuropathyDiagnosticNativeArr, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                neuropathyDiagnosticNativeArr = success.diagnostics;
            }
            return success.copy(neuropathyDiagnosticNativeArr);
        }

        public final NeuropathyDiagnosticNative[] component1() {
            return this.diagnostics;
        }

        public final Success copy(NeuropathyDiagnosticNative[] diagnostics) {
            u.j(diagnostics, "diagnostics");
            return new Success(diagnostics);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Success) && u.e(this.diagnostics, ((Success) obj).diagnostics)) {
                return true;
            }
            return false;
        }

        public final NeuropathyDiagnosticNative[] getDiagnostics() {
            return this.diagnostics;
        }

        public int hashCode() {
            return Arrays.hashCode(this.diagnostics);
        }

        public String toString() {
            return "Success(diagnostics=" + Arrays.toString(this.diagnostics) + ')';
        }
    }
}

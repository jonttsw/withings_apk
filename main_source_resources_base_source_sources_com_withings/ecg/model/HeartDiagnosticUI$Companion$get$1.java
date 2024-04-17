package com.withings.ecg.model;

import com.withings.ecg.core.HeartDiagnostic;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: HeartDiagnosticUI.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/withings/ecg/model/HeartDiagnosticUI;", "it", "Lcom/withings/ecg/core/HeartDiagnostic;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HeartDiagnosticUI$Companion$get$1 extends w implements l<HeartDiagnostic, HeartDiagnosticUI> {
    public static final HeartDiagnosticUI$Companion$get$1 INSTANCE = new HeartDiagnosticUI$Companion$get$1();

    HeartDiagnosticUI$Companion$get$1() {
        super(1);
    }

    @Override // ym0.l
    public final HeartDiagnosticUI invoke(HeartDiagnostic it) {
        u.j(it, "it");
        return HeartDiagnosticUIKt.toUI(it);
    }
}

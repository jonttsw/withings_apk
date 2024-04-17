package com.withings.manualLogging.ui.feature.addNote.cycle;

import android.content.Context;
import com.withings.common.compose.component.z4;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private static final float f41219a = 50;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f41220b = 0;

    public static final void b(z4 z4Var, Context context, int i11, CoroutineScope coroutineScope) {
        String string = context.getString(C1987R.string.cycleTracking_toast_title);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new s0(z4Var, androidx.appcompat.widget.v0.c(string, "getString(...)", context, i11, "getString(...)"), string, null), 3, null);
    }
}

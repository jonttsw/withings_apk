package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.wiscale2.C1987R;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class f6 extends kotlin.jvm.internal.w implements ym0.l<Boolean, x5> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f49190a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(Context context) {
        super(1);
        this.f49190a = context;
    }

    @Override // ym0.l
    public final x5 invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Context context = this.f49190a;
            String string = context.getString(C1987R.string.workout_enableGPSTracking);
            return new n1(4, C1987R.string.glyph_location, C1987R.color.statusInfo, string, androidx.appcompat.widget.v0.c(string, "getString(...)", context, C1987R.string.workout_learnMoreDataWithGPSAndBackgroundPermission, "getString(...)"), false);
        }
        return null;
    }
}

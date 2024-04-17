package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.wiscale2.C1987R;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class a6 extends kotlin.jvm.internal.w implements ym0.l<Boolean, x5> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f49115a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(Context context) {
        super(1);
        this.f49115a = context;
    }

    @Override // ym0.l
    public final x5 invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            Context context = this.f49115a;
            String string = context.getString(C1987R.string.workoutNotification_energySavingActivatedTitle);
            return new n1(3, C1987R.string.glyph_location, C1987R.color.statusModerate, string, androidx.appcompat.widget.v0.c(string, "getString(...)", context, C1987R.string.workoutNotification_energySavingActivatedDescription, "getString(...)"), true);
        }
        return null;
    }
}

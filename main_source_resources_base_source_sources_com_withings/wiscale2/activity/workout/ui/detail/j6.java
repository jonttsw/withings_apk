package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.workoutdata.SwimWorkoutData;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
public final class j6 extends kotlin.jvm.internal.w implements ym0.l<nm0.o<Track, List<Vasistas>, Boolean>, x5> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ fl.p f49342a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f49343b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(Context context, fl.p pVar) {
        super(1);
        this.f49342a = pVar;
        this.f49343b = context;
    }

    @Override // ym0.l
    public final x5 invoke(nm0.o<Track, List<Vasistas>, Boolean> oVar) {
        gl.x xVar;
        nm0.o<Track, List<Vasistas>, Boolean> oVar2 = oVar;
        Track a11 = oVar2.a();
        List<Vasistas> b10 = oVar2.b();
        Boolean c11 = oVar2.c();
        if (a11 == null) {
            return null;
        }
        fl.o j5 = this.f49342a.j(a11.getDeviceModel());
        if (j5 instanceof gl.x) {
            xVar = (gl.x) j5;
        } else {
            xVar = null;
        }
        if (xVar == null || (a11.getData() instanceof SwimWorkoutData) || !kotlin.jvm.internal.u.e(c11, Boolean.TRUE) || !b10.isEmpty()) {
            return null;
        }
        Context context = this.f49343b;
        String string = context.getString(C1987R.string.workoutNotification_noEnoughHrTitle);
        return new n1(1, C1987R.string.glyph_heart, C1987R.color.statusModerate, string, androidx.appcompat.widget.v0.c(string, "getString(...)", context, C1987R.string.workoutNotification_noEnoughHrDescription, "getString(...)"), false);
    }
}

package com.withings.wiscale2.activity.workout.model;

import com.withings.vasistas.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
import ym0.p;
/* compiled from: SwimWorkoutBuilder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "previousVasistas", "Lcom/withings/vasistas/model/Vasistas;", "currentVasistas", "invoke", "(Lcom/withings/vasistas/model/Vasistas;Lcom/withings/vasistas/model/Vasistas;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class SwimWorkoutBuilder$build$2 extends w implements p<Vasistas, Vasistas, Boolean> {
    public static final SwimWorkoutBuilder$build$2 INSTANCE = new SwimWorkoutBuilder$build$2();

    SwimWorkoutBuilder$build$2() {
        super(2);
    }

    @Override // ym0.p
    public final Boolean invoke(Vasistas previousVasistas, Vasistas currentVasistas) {
        u.j(previousVasistas, "previousVasistas");
        u.j(currentVasistas, "currentVasistas");
        DateTime minus = currentVasistas.getStartDate().minus(300000L);
        u.i(minus, "minus(...)");
        return Boolean.valueOf(hn.a.b(minus, previousVasistas.getEnd()));
    }
}

package com.withings.wiscale2.device.common.screen.ui;

import com.withings.wiscale2.device.common.screen.ui.WorkoutScreenOrderSettingConversation;
import com.withings.wiscale2.device.common.screen.ui.h2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: WorkoutScreenOrderFragment.kt */
/* loaded from: classes5.dex */
public final class i2 extends androidx.lifecycle.j0<h2.a> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h2 f53351a;

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<WorkoutScreenOrderSettingConversation.a, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(WorkoutScreenOrderSettingConversation.a aVar) {
            WorkoutScreenOrderSettingConversation workoutScreenOrderSettingConversation;
            WorkoutScreenOrderSettingConversation.a aVar2 = aVar;
            int a11 = aVar2.a();
            int[] b10 = aVar2.b();
            i2 i2Var = i2.this;
            h2 h2Var = i2Var.f53351a;
            workoutScreenOrderSettingConversation = h2Var.f53335f;
            i2Var.removeSource(workoutScreenOrderSettingConversation.N());
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(h2Var), null, null, new j2(i2Var.f53351a, i2Var, a11, b10, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i2(h2 h2Var) {
        WorkoutScreenOrderSettingConversation workoutScreenOrderSettingConversation;
        this.f53351a = h2Var;
        workoutScreenOrderSettingConversation = h2Var.f53335f;
        addSource(workoutScreenOrderSettingConversation.N(), new h2.b(new a()));
    }
}

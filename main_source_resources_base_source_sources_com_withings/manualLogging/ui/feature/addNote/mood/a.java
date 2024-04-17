package com.withings.manualLogging.ui.feature.addNote.mood;

import com.withings.manualLogging.core.entity.MoodLevel;
import fx.g;
import hx.n;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.j;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddMoodViewModel.kt */
@e(c = "com.withings.manualLogging.ui.feature.addNote.mood.AddMoodViewModel$saveMood$1", f = "AddMoodViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddMoodViewModel f41524a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f41525b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddMoodViewModel.kt */
    /* renamed from: com.withings.manualLogging.ui.feature.addNote.mood.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0555a extends w implements p<Long, MoodLevel, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f41526a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AddMoodViewModel f41527b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0555a(boolean z5, AddMoodViewModel addMoodViewModel) {
            super(2);
            this.f41526a = z5;
            this.f41527b = addMoodViewModel;
        }

        @Override // ym0.p
        public final y invoke(Long l5, MoodLevel moodLevel) {
            n nVar;
            long longValue = l5.longValue();
            MoodLevel mood = moodLevel;
            u.j(mood, "mood");
            DateTime now = DateTime.now();
            u.g(now);
            g gVar = new g(null, null, mood, longValue, now, false, this.f41526a, 35);
            AddMoodViewModel addMoodViewModel = this.f41527b;
            nVar = addMoodViewModel.f41517a;
            nVar.a(gVar);
            addMoodViewModel.f41519c.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AddMoodViewModel addMoodViewModel, boolean z5, d<? super a> dVar) {
        super(2, dVar);
        this.f41524a = addMoodViewModel;
        this.f41525b = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f41524a, this.f41525b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MoodLevel moodLevel;
        Long l5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        AddMoodViewModel addMoodViewModel = this.f41524a;
        Integer num = (Integer) addMoodViewModel.m0().getValue();
        if (num != null) {
            int intValue = num.intValue();
            MoodLevel.f40656b.getClass();
            moodLevel = MoodLevel.a.a(intValue);
        } else {
            moodLevel = null;
        }
        l5 = addMoodViewModel.f41518b;
        cr.a.a(new j(l5, moodLevel), new C0555a(this.f41525b, addMoodViewModel));
        return y.f85009a;
    }
}

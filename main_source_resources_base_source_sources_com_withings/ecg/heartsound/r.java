package com.withings.ecg.heartsound;

import android.content.Context;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.ecg.details.a2;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.webservices.GetSignalDataSyncFactory;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteGroupKt;
import com.withings.note.model.NoteRepository;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class r extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f38505a;

    /* renamed from: b  reason: collision with root package name */
    private final HeartSignalRepository f38506b;

    /* renamed from: c  reason: collision with root package name */
    private final fy.k f38507c;

    /* renamed from: d  reason: collision with root package name */
    private final fy.d f38508d;

    /* renamed from: e  reason: collision with root package name */
    private final t00.d f38509e;

    /* renamed from: f  reason: collision with root package name */
    private final GetSignalDataSyncFactory f38510f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38511g;

    /* renamed from: h  reason: collision with root package name */
    private final a2 f38512h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38513i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38514j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38515k;

    /* renamed from: l  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38516l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38517m;

    /* renamed from: n  reason: collision with root package name */
    private final List<com.withings.measure.detail.ui.views.j> f38518n;

    /* compiled from: HeartSoundDetailsFragment.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ HeartSignalMeasurement f38520b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(HeartSignalMeasurement heartSignalMeasurement) {
            super(0);
            this.f38520b = heartSignalMeasurement;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            Object runBlocking$default;
            r rVar = r.this;
            HeartSignalRepository heartSignalRepository = rVar.f38506b;
            HeartSignalMeasurement heartSignalMeasurement = this.f38520b;
            HeartSignalRepository.flagAsDeletedById$default(heartSignalRepository, heartSignalMeasurement.getId(), false, 2, null);
            new mq.i(rVar.f38505a).c(heartSignalMeasurement.getSignal().getMeta().getType(), heartSignalMeasurement.getTimestamp().getMillis());
            NoteGroup noteGroup = (NoteGroup) rVar.f38513i.getValue();
            if (noteGroup != null) {
                noteGroup.setDeleted(true);
                noteGroup.setSynced(false);
                NoteRepository noteRepository = ah.i.f781a;
                if (noteRepository != null) {
                    noteRepository.update(noteGroup);
                    runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new s(rVar, noteGroup, null), 1, null);
                    nm0.y yVar = (nm0.y) runBlocking$default;
                } else {
                    kotlin.jvm.internal.u.s("noteRepository");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeartSoundDetailsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.heartsound.HeartSoundDetailsViewModel$saveNote$1$1", f = "HeartSoundDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ NoteGroup f38521a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(NoteGroup noteGroup, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f38521a = noteGroup;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f38521a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            NoteRepository noteRepository = ah.i.f781a;
            if (noteRepository != null) {
                NoteGroup it = this.f38521a;
                kotlin.jvm.internal.u.i(it, "$it");
                noteRepository.update(it);
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("noteRepository");
            throw null;
        }
    }

    public r(long j5, Context context, HeartSignalRepository heartSignalRepository, fy.k kVar, fy.d dVar, t00.d networkSyncManager, GetSignalDataSyncFactory getSignalDataSyncFactory, sq.f fVar, NoteRepository noteRepository) {
        kotlin.jvm.internal.u.j(heartSignalRepository, "heartSignalRepository");
        kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
        kotlin.jvm.internal.u.j(noteRepository, "noteRepository");
        this.f38505a = context;
        this.f38506b = heartSignalRepository;
        this.f38507c = kVar;
        this.f38508d = dVar;
        this.f38509e = networkSyncManager;
        this.f38510f = getSignalDataSyncFactory;
        androidx.lifecycle.j0 b10 = e1.b(heartSignalRepository.getHeartSignalLiveData(j5), v.f38545a);
        this.f38511g = b10;
        a2 a2Var = new a2(b10, fVar);
        this.f38512h = a2Var;
        androidx.lifecycle.j0 c11 = e1.c(a2Var, new z(noteRepository));
        this.f38513i = c11;
        this.f38514j = e1.b(a2Var, t.f38532a);
        this.f38515k = e1.b(b10, new y(this));
        this.f38516l = e1.b(c11, q.f38503a);
        this.f38517m = e1.c(a2Var, new x(this));
        this.f38518n = kotlin.collections.x.W(new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_feelingTitle, C1987R.string.ecg_detail_resultAddDetails_feelingDescription, C1987R.drawable.ic_neutral_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_contextTitle, C1987R.string.ecg_detail_resultAddDetails_contextDescription, C1987R.drawable.ic_time_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_intakesTitle, C1987R.string.ecg_detail_resultAddDetails_intakesDescription, C1987R.drawable.ic_mug_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_medicinesTitle, C1987R.string.ecg_detail_resultAddDetails_medicinesDescription, C1987R.drawable.ic_pill_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_armTitle, C1987R.string.ecg_detail_resultAddDetails_armDescription, C1987R.drawable.ic_arm_black_24dp), new com.withings.measure.detail.ui.views.j(C1987R.string.ecg_detail_resultAddDetails_symptomsTitle, C1987R.string.ecg_detail_resultAddDetails_symptomsDescription, C1987R.drawable.ic_symptoms_black_24dp));
    }

    public final androidx.lifecycle.j0 A0() {
        return this.f38517m;
    }

    public final androidx.lifecycle.j0 B0() {
        return this.f38515k;
    }

    public final void F0(String note) {
        kotlin.jvm.internal.u.j(note, "note");
        NoteGroup noteGroup = (NoteGroup) this.f38513i.getValue();
        if (noteGroup != null) {
            NoteGroupKt.addNoteText(noteGroup, note);
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new b(noteGroup, null), 2, null);
        }
    }

    public final void r0() {
        androidx.lifecycle.j0 j0Var = this.f38511g;
        this.f38512h.removeSource(j0Var);
        HeartSignalMeasurement heartSignalMeasurement = (HeartSignalMeasurement) j0Var.getValue();
        if (heartSignalMeasurement != null) {
            int i11 = vh.h.f103738e;
            vh.h.d(new a(heartSignalMeasurement));
        }
    }

    public final List<com.withings.measure.detail.ui.views.j> t0() {
        return this.f38518n;
    }

    public final androidx.lifecycle.j0 y0() {
        return this.f38516l;
    }

    public final androidx.lifecycle.j0 z0() {
        return this.f38514j;
    }
}

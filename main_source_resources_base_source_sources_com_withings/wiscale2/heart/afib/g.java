package com.withings.wiscale2.heart.afib;

import android.widget.ProgressBar;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.model.NoteGroupExtensionsKt;
import com.withings.ecg.webservices.GetSignalDataSyncFactory;
import com.withings.note.model.NoteGroup;
import com.withings.note.model.NoteRepository;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import tb0.s1;
/* compiled from: AFibDetailFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibDetailFragment$initGraph$1", f = "AFibDetailFragment.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57155a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ e f57156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AFibDetailFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibDetailFragment$initGraph$1$dataPoints$1", f = "AFibDetailFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends nm0.j<? extends Integer, ? extends Float>>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f57157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f57157a = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f57157a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends nm0.j<? extends Integer, ? extends Float>>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            NoteGroup noteGroup;
            HeartSignalMeasurement heartSignalMeasurement;
            t00.d dVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            NoteRepository noteRepository = ah.i.f781a;
            List list = null;
            if (noteRepository != null) {
                e eVar = this.f57157a;
                List<NoteGroup> noteGroupForMeasureGroupWsId = noteRepository.getNoteGroupForMeasureGroupWsId(e.v1(eVar).getGroup().getWsId());
                if (noteGroupForMeasureGroupWsId != null) {
                    noteGroup = (NoteGroup) kotlin.collections.x.K(noteGroupForMeasureGroupWsId);
                } else {
                    noteGroup = null;
                }
                if (noteGroup != null) {
                    HeartSignalRepository heartSignalRepository = eVar.f57136j;
                    if (heartSignalRepository != null) {
                        heartSignalMeasurement = NoteGroupExtensionsKt.getEcg(noteGroup, heartSignalRepository);
                    } else {
                        kotlin.jvm.internal.u.s("signalRepository");
                        throw null;
                    }
                } else {
                    heartSignalMeasurement = null;
                }
                if (heartSignalMeasurement != null) {
                    List x12 = e.x1(eVar, heartSignalMeasurement);
                    if (x12.isEmpty()) {
                        try {
                            dVar = eVar.f57138l;
                        } catch (Throwable th2) {
                            nm0.l.a(th2);
                        }
                        if (dVar != null) {
                            GetSignalDataSyncFactory getSignalDataSyncFactory = eVar.f57137k;
                            if (getSignalDataSyncFactory != null) {
                                dVar.d(getSignalDataSyncFactory.create(heartSignalMeasurement), "view_afib_detail", null);
                                nm0.y yVar = nm0.y.f85009a;
                                list = e.x1(eVar, heartSignalMeasurement);
                            } else {
                                kotlin.jvm.internal.u.s("getSignalDataSyncFactory");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.u.s("networkSyncManager");
                            throw null;
                        }
                    } else {
                        list = x12;
                    }
                }
                if (list == null) {
                    return kotlin.collections.i0.f76187a;
                }
                return list;
            }
            kotlin.jvm.internal.u.s("noteRepository");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, qm0.d<? super g> dVar) {
        super(2, dVar);
        this.f57156b = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new g(this.f57156b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57155a;
        e eVar = this.f57156b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(eVar, null);
            this.f57155a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list = (List) obj;
        s1 s1Var = eVar.f57134h;
        if (s1Var != null) {
            ProgressBar graphLoading = s1Var.f99466e;
            kotlin.jvm.internal.u.i(graphLoading, "graphLoading");
            graphLoading.setVisibility(8);
            if (!list.isEmpty()) {
                e.w1(eVar, list);
            }
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }
}

package com.withings.wiscale2.sleep.ui.edition;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.track.data.Track;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NightEditionActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.edition.NightEditionActivity$save$1", f = "NightEditionActivity.kt", l = {ConstantsWs.MEASURE_TYPE_WAIST, 191, 192}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class d extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f60470a;

    /* renamed from: b  reason: collision with root package name */
    int f60471b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NightEditionActivity f60472c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NightEditionActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.edition.NightEditionActivity$save$1$1", f = "NightEditionActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends i implements p<CoroutineScope, qm0.d<? super Track>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Track f60473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NightEditionActivity f60474b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Track track, NightEditionActivity nightEditionActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f60473a = track;
            this.f60474b = nightEditionActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f60473a, this.f60474b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z5;
            DateTime manualStartDate;
            boolean z11;
            DateTime manualEndDate;
            DateTime dateTime;
            boolean z12;
            boolean blankVasistasFilled;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            NightEditionActivity nightEditionActivity = this.f60474b;
            z5 = nightEditionActivity.f60445m;
            Track track = this.f60473a;
            if (z5) {
                manualStartDate = nightEditionActivity.f60450r;
                if (manualStartDate == null) {
                    u.s("updatedAsleepTime");
                    throw null;
                }
            } else {
                manualStartDate = track.getManualStartDate();
            }
            track.setManualStartDate(manualStartDate);
            z11 = nightEditionActivity.f60446n;
            if (z11) {
                manualEndDate = nightEditionActivity.f60451s;
                if (manualEndDate == null) {
                    u.s("updatedAwakeTime");
                    throw null;
                }
            } else {
                manualEndDate = track.getManualEndDate();
            }
            track.setManualEndDate(manualEndDate);
            DateTime L3 = NightEditionActivity.L3(nightEditionActivity);
            dateTime = nightEditionActivity.f60452t;
            if (dateTime != null) {
                if (u.e(L3, dateTime)) {
                    L3 = null;
                }
                track.setManualStartDate(L3);
                z12 = nightEditionActivity.f60447o;
                if (z12) {
                    blankVasistasFilled = NightEditionActivity.H3(nightEditionActivity).isChecked();
                } else {
                    blankVasistasFilled = track.getBlankVasistasFilled();
                }
                track.setBlankVasistasFilled(blankVasistasFilled);
                return ei0.i.f65410a.a(track, null);
            }
            u.s("startOfSleep");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NightEditionActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.edition.NightEditionActivity$save$1$user$1", f = "NightEditionActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends i implements p<CoroutineScope, qm0.d<? super User>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Track f60475a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Track track, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f60475a = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f60475a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super User> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            return m70.i.b().i(this.f60475a.getUserId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NightEditionActivity nightEditionActivity, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f60472c = nightEditionActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f60472c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r8.f60471b
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            com.withings.wiscale2.sleep.ui.edition.NightEditionActivity r6 = r8.f60472c
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            java.lang.Object r0 = r8.f60470a
            com.withings.user.User r0 = (com.withings.user.User) r0
            nm0.l.b(r9)
            goto L6c
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.f60470a
            com.withings.wiscale2.track.data.Track r1 = (com.withings.wiscale2.track.data.Track) r1
            nm0.l.b(r9)
            goto L55
        L2a:
            nm0.l.b(r9)
            goto L3e
        L2e:
            nm0.l.b(r9)
            kotlinx.coroutines.flow.MutableSharedFlow r9 = com.withings.wiscale2.sleep.ui.edition.NightEditionActivity.J3(r6)
            r8.f60471b = r5
            java.lang.Object r9 = kotlinx.coroutines.flow.FlowKt.first(r9, r8)
            if (r9 != r0) goto L3e
            return r0
        L3e:
            r1 = r9
            com.withings.wiscale2.track.data.Track r1 = (com.withings.wiscale2.track.data.Track) r1
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.sleep.ui.edition.d$b r7 = new com.withings.wiscale2.sleep.ui.edition.d$b
            r7.<init>(r1, r2)
            r8.f60470a = r1
            r8.f60471b = r4
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r7, r8)
            if (r9 != r0) goto L55
            return r0
        L55:
            com.withings.user.User r9 = (com.withings.user.User) r9
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.sleep.ui.edition.d$a r7 = new com.withings.wiscale2.sleep.ui.edition.d$a
            r7.<init>(r1, r6, r2)
            r8.f60470a = r9
            r8.f60471b = r3
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r4, r7, r8)
            if (r1 != r0) goto L6b
            return r0
        L6b:
            r0 = r9
        L6c:
            bi0.a r9 = bi0.a.f21233a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            nm0.j r2 = new nm0.j
            java.lang.String r3 = "value"
            r2.<init>(r3, r1)
            java.util.Map r1 = kotlin.collections.s0.i(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "night_edited "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            x70.b.l(r9, r1, r2)
            oi0.b r9 = oi0.b.h()
            java.lang.String r1 = "foreground"
            r9.n(r0, r1)
            android.content.Intent r9 = new android.content.Intent
            java.lang.Class<com.withings.wiscale2.sleep.ui.edition.NightEditionFakeStuffActivity> r0 = com.withings.wiscale2.sleep.ui.edition.NightEditionFakeStuffActivity.class
            r9.<init>(r6, r0)
            r0 = 14
            r6.startActivityForResult(r9, r0)
            nm0.y r9 = nm0.y.f85009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.edition.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

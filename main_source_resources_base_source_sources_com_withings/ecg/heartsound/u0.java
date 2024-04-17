package com.withings.ecg.heartsound;

import android.app.Application;
import androidx.lifecycle.e1;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* compiled from: HeartSoundListActivity.kt */
/* loaded from: classes3.dex */
public final class u0 extends androidx.lifecycle.b implements HeartSignalRepository.Listener {

    /* renamed from: a  reason: collision with root package name */
    private final HeartSignalRepository f38538a;

    /* renamed from: b  reason: collision with root package name */
    private Long f38539b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38540c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f38541d;

    /* renamed from: e  reason: collision with root package name */
    private final xw.n<Boolean> f38542e;

    /* compiled from: HeartSoundListActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<List<HeartSignalMeasurement>, t0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Application f38544b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Application application) {
            super(1);
            this.f38544b = application;
        }

        @Override // ym0.l
        public final t0 invoke(List<HeartSignalMeasurement> list) {
            int i11;
            int M;
            List<HeartSignalMeasurement> heartSoundsList = list;
            kotlin.jvm.internal.u.j(heartSoundsList, "heartSoundsList");
            ListIterator<HeartSignalMeasurement> listIterator = heartSoundsList.listIterator(heartSoundsList.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    long id2 = listIterator.previous().getId();
                    Long l5 = u0.this.f38539b;
                    if (l5 != null && id2 == l5.longValue()) {
                        i11 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i11);
            if (i11 == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                M = valueOf.intValue();
            } else {
                M = kotlin.collections.x.M(heartSoundsList);
            }
            List<HeartSignalMeasurement> list2 = heartSoundsList;
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
            for (HeartSignalMeasurement heartSignalMeasurement : list2) {
                arrayList.add(new i0(heartSignalMeasurement.getId(), heartSignalMeasurement.getTimestamp(), b50.b.m(heartSignalMeasurement.getTimestamp(), this.f38544b, true, 4), heartSignalMeasurement.getSignal().getSignalPath()));
            }
            return new t0(arrayList, M);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Application application, HeartSignalRepository heartSignalRepository, User user, Long l5) {
        super(application);
        kotlin.jvm.internal.u.j(user, "user");
        this.f38538a = heartSignalRepository;
        this.f38539b = l5;
        this.f38540c = e1.b(heartSignalRepository.getSignalsWithStethoscopeSoundLiveData(user.q()), new a(application));
        this.f38541d = new androidx.lifecycle.k0<>();
        this.f38542e = new xw.n<>();
        heartSignalRepository.registerListener(this);
    }

    public final xw.n<Boolean> g0() {
        return this.f38542e;
    }

    public final androidx.lifecycle.j0 i0() {
        return this.f38540c;
    }

    public final androidx.lifecycle.k0<Integer> j0() {
        return this.f38541d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.g1
    public final void onCleared() {
        this.f38538a.unregisterListener(this);
        super.onCleared();
    }

    @Override // com.withings.ecg.model.HeartSignalRepository.Listener
    public final void onHeartSignalDeleted(long j5, long j11) {
        this.f38542e.postValue(Boolean.TRUE);
    }

    @Override // com.withings.ecg.model.HeartSignalRepository.Listener
    public final void onHeartSignalInserted(HeartSignalMeasurement heartSignalMeasurement) {
        kotlin.jvm.internal.u.j(heartSignalMeasurement, "heartSignalMeasurement");
    }
}

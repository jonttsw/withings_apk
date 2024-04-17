package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
public final class t6 extends androidx.lifecycle.j0<List<? extends x5>> {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashSet f49655a = new LinkedHashSet();

    /* compiled from: WorkoutNotification.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<x5, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveData<x5> f49657b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<LiveData<x5>> f49658c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(LiveData<x5> liveData, List<? extends LiveData<x5>> list) {
            super(1);
            this.f49657b = liveData;
            this.f49658c = list;
        }

        @Override // ym0.l
        public final nm0.y invoke(x5 x5Var) {
            t6 t6Var = t6.this;
            t6Var.f49655a.add(this.f49657b);
            int size = t6Var.f49655a.size();
            List<LiveData<x5>> list = this.f49658c;
            if (size == list.size()) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    x5 x5Var2 = (x5) ((LiveData) it.next()).getValue();
                    if (x5Var2 != null) {
                        arrayList.add(x5Var2);
                    }
                }
                t6Var.setValue(arrayList);
            }
            return nm0.y.f85009a;
        }
    }

    public t6(List<? extends LiveData<x5>> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            LiveData liveData = (LiveData) it.next();
            addSource(liveData, new q6(new a(liveData, list)));
        }
    }
}

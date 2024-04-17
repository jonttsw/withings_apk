package com.withings.alarm.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.ui.l;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: MultipleAlarmFragment.java */
/* loaded from: classes3.dex */
public abstract class n extends Fragment implements l.d {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f31190l = 0;

    /* renamed from: c  reason: collision with root package name */
    protected RecyclerView f31191c;

    /* renamed from: d  reason: collision with root package name */
    protected a f31192d;

    /* renamed from: e  reason: collision with root package name */
    protected b f31193e;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList f31196h;

    /* renamed from: f  reason: collision with root package name */
    protected int f31194f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f31195g = -1;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f31197i = false;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f31198j = false;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f31199k = false;

    /* compiled from: MultipleAlarmFragment.java */
    /* loaded from: classes3.dex */
    public abstract class a extends RecyclerView.Adapter<l> {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return n.this.f31196h.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(l lVar, int i11) {
            l lVar2 = lVar;
            n nVar = n.this;
            DeviceAlarm deviceAlarm = (DeviceAlarm) nVar.f31196h.get(i11);
            lVar2.q(deviceAlarm, nVar.f31197i, nVar.f31198j, nVar.f31199k);
            int j5 = deviceAlarm.j() - 1;
            int i12 = nVar.f31194f;
            if (i12 >= 0 && j5 != i12 && lVar2.k()) {
                lVar2.p();
            } else if (nVar.f31195g == j5) {
                lVar2.f();
            } else {
                int i13 = nVar.f31194f;
                if (i13 < 0) {
                    lVar2.p();
                } else if (j5 == i13 && !lVar2.k()) {
                    if (nVar.f31195g == -2) {
                        lVar2.r();
                    } else {
                        lVar2.g();
                    }
                }
            }
        }
    }

    /* compiled from: MultipleAlarmFragment.java */
    /* loaded from: classes3.dex */
    public interface b {
        void U0(n nVar, DeviceAlarm deviceAlarm);

        void V0(n nVar, DeviceAlarm deviceAlarm);

        void W0(n nVar, DeviceAlarm deviceAlarm);

        void f3(n nVar, DeviceAlarm deviceAlarm);
    }

    @Override // com.withings.alarm.ui.l.d
    public final void I(DeviceAlarm deviceAlarm) {
        this.f31193e.f3(this, deviceAlarm);
    }

    @Override // com.withings.alarm.ui.l.d
    public final void L0(l lVar) {
        View view = lVar.itemView;
        Rect rect = new Rect();
        this.f31191c.getDrawingRect(rect);
        if (rect.bottom < view.getY() + view.getHeight() + ah.g.k(150, this.f31191c.getContext())) {
            this.f31191c.y0(0, ah.g.k(150, getContext()));
            return;
        }
        Rect rect2 = new Rect();
        this.f31191c.getDrawingRect(rect2);
        if (view.getY() < rect2.top) {
            this.f31191c.y0(0, (int) view.getY());
        }
    }

    @Override // com.withings.alarm.ui.l.d
    public final void N0(DeviceAlarm deviceAlarm) {
        rg.b b10 = rg.b.b();
        Context context = getContext();
        b10.getClass();
        rg.b.i(context, deviceAlarm);
    }

    @Override // com.withings.alarm.ui.l.d
    public final void c1(DeviceAlarm deviceAlarm) {
        this.f31193e.U0(this, deviceAlarm);
    }

    @Override // com.withings.alarm.ui.l.d
    public final void e0(int i11) {
        this.f31195g = -1;
        this.f31194f = i11 - 1;
        this.f31192d.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1987R.layout.fragment_multiple_alarm, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1987R.id.recycler_alarms);
        this.f31191c = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.f31196h = new ArrayList();
    }

    @Override // com.withings.alarm.ui.l.d
    public final void p1() {
        this.f31195g = this.f31194f;
        this.f31194f = -1;
        this.f31192d.notifyDataSetChanged();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Comparator] */
    public final void t1(DeviceAlarm deviceAlarm) {
        this.f31194f = deviceAlarm.j() - 1;
        this.f31196h.add(deviceAlarm);
        Collections.sort(this.f31196h, new Object());
        final int indexOf = this.f31196h.indexOf(deviceAlarm);
        this.f31192d.notifyItemChanged(indexOf);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.withings.alarm.ui.m
            @Override // java.lang.Runnable
            public final void run() {
                n.this.f31191c.A0(indexOf);
            }
        }, 500L);
    }

    @Override // com.withings.alarm.ui.l.d
    public final void u0(DeviceAlarm deviceAlarm) {
        this.f31193e.W0(this, deviceAlarm);
    }

    public final void u1(DeviceAlarm deviceAlarm) {
        if (this.f31194f == deviceAlarm.j() - 1) {
            this.f31192d.notifyItemRemoved(this.f31196h.indexOf(deviceAlarm));
            this.f31196h.remove(deviceAlarm);
            this.f31194f = -1;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Comparator] */
    public final void v1(List<DeviceAlarm> list, boolean z5, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList(list);
        this.f31196h = arrayList;
        this.f31197i = z5;
        this.f31198j = z11;
        this.f31199k = z12;
        Collections.sort(arrayList, new Object());
        if (this.f31191c != null && this.f31196h != null) {
            this.f31192d.notifyDataSetChanged();
        }
    }

    public final void w1(b bVar) {
        this.f31193e = bVar;
    }

    @Override // com.withings.alarm.ui.l.d
    public void P0(vg.a aVar, DeviceAlarm deviceAlarm) {
    }
}

package com.withings.devicesetup.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.withings.devicesetup.Setup;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SetupScanResultFragment.java */
/* loaded from: classes3.dex */
public class i extends Fragment {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f37930k = 0;

    /* renamed from: c  reason: collision with root package name */
    private c f37931c;

    /* renamed from: d  reason: collision with root package name */
    private b f37932d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f37933e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f37934f;

    /* renamed from: g  reason: collision with root package name */
    private WorkflowBar f37935g;

    /* renamed from: h  reason: collision with root package name */
    private SwipeRefreshLayout f37936h;

    /* renamed from: i  reason: collision with root package name */
    private Setup f37937i;

    /* renamed from: j  reason: collision with root package name */
    private d f37938j;

    /* compiled from: SetupScanResultFragment.java */
    /* loaded from: classes3.dex */
    final class a implements SwipeRefreshLayout.g {
        a() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.g
        public final void i0() {
            i.this.f37931c.q1();
        }
    }

    /* compiled from: SetupScanResultFragment.java */
    /* loaded from: classes3.dex */
    public interface b {
        ArrayList D();
    }

    /* compiled from: SetupScanResultFragment.java */
    /* loaded from: classes3.dex */
    public interface c {
        void J2();

        void Y2(xi.b bVar);

        void q1();
    }

    /* compiled from: SetupScanResultFragment.java */
    /* loaded from: classes3.dex */
    public class d extends RecyclerView.Adapter<a> {

        /* renamed from: a  reason: collision with root package name */
        private List<xi.b> f37940a;

        /* renamed from: b  reason: collision with root package name */
        private c f37941b;

        /* compiled from: SetupScanResultFragment.java */
        /* loaded from: classes3.dex */
        class a extends RecyclerView.z {

            /* renamed from: a  reason: collision with root package name */
            public TextView f37943a;

            /* renamed from: b  reason: collision with root package name */
            public xi.b f37944b;

            /* compiled from: SetupScanResultFragment.java */
            /* renamed from: com.withings.devicesetup.ui.i$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            final class View$OnClickListenerC0499a implements View.OnClickListener {
                View$OnClickListenerC0499a() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar = a.this;
                    c cVar = d.this.f37941b;
                    i iVar = i.this;
                    cVar.Y2(aVar.f37944b);
                }
            }

            a(View view) {
                super(view);
                this.f37943a = (TextView) view.findViewById(C1987R.id.device_name);
                view.setOnClickListener(new View$OnClickListenerC0499a());
            }
        }

        d(List<xi.b> list, c cVar) {
            this.f37940a = list;
            this.f37941b = cVar;
        }

        final void e(List<xi.b> list) {
            this.f37940a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.f37940a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(a aVar, int i11) {
            a aVar2 = aVar;
            xi.b bVar = this.f37940a.get(i11);
            aVar2.f37944b = bVar;
            aVar2.f37943a.setText(bVar.getName());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final a onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(C1987R.layout.list_item_scan_result, viewGroup, false));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f37931c = (c) context;
        this.f37932d = (b) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37937i = (Setup) getArguments().getParcelable("setup");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1987R.layout.fragment_setup_result_scan, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        SwipeRefreshLayout swipeRefreshLayout = this.f37936h;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
            this.f37936h.destroyDrawingCache();
            this.f37936h.clearAnimation();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f37936h = (SwipeRefreshLayout) view.findViewById(C1987R.id.swipeRefresh);
        this.f37933e = (TextView) view.findViewById(C1987R.id.setup_title);
        this.f37934f = (RecyclerView) view.findViewById(C1987R.id.recycler_view_result);
        this.f37935g = (WorkflowBar) view.findViewById(C1987R.id.workflowBar);
        this.f37933e.setText(this.f37937i.j0());
        this.f37935g.setRightEnabled(false);
        WorkflowBar workflowBar = this.f37935g;
        workflowBar.setLeftText(C1987R.string._CANCEL_);
        workflowBar.setRightText(C1987R.string._REFRESH_);
        this.f37935g.setRightClickListener(new j(this));
        this.f37935g.setLeftClickListener(new k(this));
        this.f37934f.setHasFixedSize(true);
        RecyclerView recyclerView = this.f37934f;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        d dVar = new d(this.f37932d.D(), this.f37931c);
        this.f37938j = dVar;
        this.f37934f.setAdapter(dVar);
        this.f37936h.setOnRefreshListener(new a());
    }

    public final void t1() {
        this.f37936h.setRefreshing(false);
        this.f37935g.setRightEnabled(true);
    }

    public final void u1() {
        this.f37938j.e(this.f37932d.D());
        this.f37938j.notifyDataSetChanged();
    }
}

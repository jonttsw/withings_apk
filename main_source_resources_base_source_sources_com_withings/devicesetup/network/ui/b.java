package com.withings.devicesetup.network.ui;

import ah.u;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.v;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.withings.comm.wpp.generated.object.WifiApScan;
import com.withings.devicesetup.network.conversation.WifiSetupConversation;
import com.withings.features.FeatureFlag;
import com.withings.wiscale2.C1987R;
import e2.t;
import ej.w;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ScanWifiFragment.java */
/* loaded from: classes3.dex */
public class b extends Fragment implements View.OnClickListener {

    /* renamed from: c */
    private InterfaceC0495b f37779c;

    /* renamed from: d */
    private u70.i f37780d;

    /* renamed from: e */
    private String f37781e;

    /* renamed from: f */
    private ArrayList f37782f = new ArrayList();

    /* renamed from: g */
    private WifiSetupConversation f37783g;

    /* renamed from: h */
    private RecyclerView f37784h;

    /* renamed from: i */
    private SwipeRefreshLayout f37785i;

    /* renamed from: j */
    private TextView f37786j;

    /* compiled from: ScanWifiFragment.java */
    /* renamed from: com.withings.devicesetup.network.ui.b$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC0495b {
    }

    /* compiled from: ScanWifiFragment.java */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.Adapter<d> {
        c() {
            b.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return b.this.f37782f.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(d dVar, int i11) {
            int i12;
            int i13;
            int i14;
            d dVar2 = dVar;
            final qj.h hVar = (qj.h) b.this.f37782f.get(i11);
            WifiApScan wifiApScan = hVar.f92797a;
            Context context = dVar2.itemView.getContext();
            boolean z5 = hVar.f92798b;
            if (z5) {
                i12 = 16842806;
            } else {
                i12 = 16842808;
            }
            String str = wifiApScan.ssid;
            TextView textView = dVar2.f37789a;
            textView.setText(str);
            textView.setTextColor(u.v(i12, context));
            if (hVar.f92799c && wr.b.c(FeatureFlag.f39141z)) {
                textView.setTypeface(null, 1);
            }
            int i15 = 0;
            if (z5) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            dVar2.f37790b.setVisibility(i13);
            ImageView imageView = dVar2.f37791c;
            imageView.setVisibility(0);
            byte b10 = wifiApScan.rssi;
            if (b10 < -85) {
                i14 = C1987R.drawable.wifi_level_0;
            } else {
                int i16 = C1987R.drawable.wifi_level_1;
                if (b10 >= -80 && b10 >= -75 && b10 >= -70) {
                    i16 = C1987R.drawable.wifi_level_2;
                    if (b10 >= -65 && b10 >= -60 && b10 >= -57) {
                        i16 = C1987R.drawable.wifi_level_3;
                        if (b10 >= -50 && b10 >= -45) {
                            i14 = C1987R.drawable.wifi_level_4;
                        }
                    }
                }
                i14 = i16;
            }
            imageView.setImageResource(i14);
            if ((wifiApScan.authFlags & 1) == 1) {
                i15 = 4;
            }
            dVar2.f37792d.setVisibility(i15);
            dVar2.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.devicesetup.network.ui.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b.this.u1(hVar);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final d onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new d(b.this.getActivity().getLayoutInflater().inflate(C1987R.layout.list_item_wifi_scan, viewGroup, false));
        }
    }

    /* compiled from: ScanWifiFragment.java */
    /* loaded from: classes3.dex */
    private class d extends RecyclerView.z {

        /* renamed from: a */
        final TextView f37789a;

        /* renamed from: b */
        final TextView f37790b;

        /* renamed from: c */
        final ImageView f37791c;

        /* renamed from: d */
        final ImageView f37792d;

        public d(View view) {
            super(view);
            this.f37789a = (TextView) view.findViewById(16908308);
            this.f37790b = (TextView) view.findViewById(16908309);
            this.f37791c = (ImageView) view.findViewById(C1987R.id.signal);
            this.f37792d = (ImageView) view.findViewById(C1987R.id.secured);
        }
    }

    public static /* synthetic */ void s1(b bVar) {
        bVar.f37782f.clear();
        bVar.f37784h.getAdapter().notifyDataSetChanged();
        bVar.w1();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id2 = view.getId();
        if (id2 == C1987R.id.action_refresh) {
            this.f37782f.clear();
            this.f37784h.getAdapter().notifyDataSetChanged();
            w1();
            return;
        }
        InterfaceC0495b interfaceC0495b = this.f37779c;
        if (interfaceC0495b != null && id2 == C1987R.id.manual) {
            ((PickWifiForSetupActivity) interfaceC0495b).F3();
        }
        InterfaceC0495b interfaceC0495b2 = this.f37779c;
        if (interfaceC0495b2 != null && id2 == C1987R.id.qrScannerButton) {
            ((PickWifiForSetupActivity) interfaceC0495b2).G3();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.f37780d = (u70.i) getArguments().getSerializable("macAddress");
        if (getArguments() != null && getArguments().getString("currentSSID") != null) {
            str = getArguments().getString("currentSSID");
            while (str.startsWith("\"")) {
                str = str.substring(1);
            }
            while (str.endsWith("\"")) {
                str = android.support.v4.media.a.b(str, 1, 0);
            }
        } else {
            str = null;
        }
        this.f37781e = str;
        WifiSetupConversation wifiSetupConversation = (WifiSetupConversation) w.w().y(this.f37780d, WifiSetupConversation.class);
        this.f37783g = wifiSetupConversation;
        wifiSetupConversation.O();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1987R.layout.fragment_wifi_scan, viewGroup, false);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [qj.h, java.lang.Object] */
    public void onEventMainThread(bq.a aVar) {
        Object obj;
        if (aVar.f21723a.equals(this.f37780d)) {
            ?? obj2 = new Object();
            obj2.f92799c = false;
            obj2.f92797a = aVar.f21724b;
            obj2.f92798b = aVar.f21725c;
            ArrayList arrayList = this.f37782f;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((qj.h) obj).f92797a.ssid.equals(obj2.f92797a.ssid)) {
                    break;
                }
            }
            qj.h hVar = (qj.h) obj;
            if (hVar != null) {
                if (hVar.f92797a.rssi < obj2.f92797a.rssi) {
                    int indexOf = arrayList.indexOf(hVar);
                    arrayList.remove(indexOf);
                    arrayList.add(indexOf, obj2);
                    this.f37784h.getAdapter().notifyItemChanged(indexOf);
                }
            } else if (obj2.f92797a.ssid.equalsIgnoreCase(this.f37781e)) {
                obj2.f92799c = true;
                arrayList.add(0, obj2);
                this.f37784h.getAdapter().notifyItemInserted(0);
            } else {
                int size = arrayList.size();
                arrayList.add(size, obj2);
                this.f37784h.getAdapter().notifyItemInserted(size);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        jk0.c.b().g(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        jk0.c.b().f(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(C1987R.id.manual).setOnClickListener(this);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(C1987R.id.swipeRefresh);
        this.f37785i = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new t(this, 3));
        this.f37785i.setDistanceToTriggerSync(512);
        if (wr.b.c(FeatureFlag.f39123p)) {
            view.findViewById(C1987R.id.qrScannerButtonDivider).setVisibility(0);
            TextView textView = (TextView) view.findViewById(C1987R.id.qrScannerButton);
            this.f37786j = textView;
            textView.setVisibility(0);
            this.f37786j.setOnClickListener(this);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1987R.id.networkList);
        this.f37784h = recyclerView;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        this.f37784h.setHasFixedSize(true);
        this.f37784h.setAdapter(new c());
        this.f37785i.setRefreshing(true);
        requireActivity().addMenuProvider(new a());
    }

    public final void u1(qj.h hVar) {
        InterfaceC0495b interfaceC0495b = this.f37779c;
        if (interfaceC0495b != null) {
            ((PickWifiForSetupActivity) interfaceC0495b).H3(hVar);
        }
    }

    public final void v1(InterfaceC0495b interfaceC0495b) {
        this.f37779c = interfaceC0495b;
    }

    public final void w1() {
        this.f37785i.setRefreshing(true);
        this.f37783g.O();
    }

    public void onEventMainThread(bq.b bVar) {
        if (bVar.f21726a.equals(this.f37780d)) {
            this.f37785i.setRefreshing(false);
            this.f37785i.setRefreshing(false);
        }
    }

    /* compiled from: ScanWifiFragment.java */
    /* loaded from: classes3.dex */
    final class a implements v {
        a() {
            b.this = r1;
        }

        @Override // androidx.core.view.v
        public final boolean c(MenuItem menuItem) {
            if (menuItem.getItemId() == C1987R.id.refresh) {
                b.this.w1();
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.v
        public final void d(Menu menu, MenuInflater menuInflater) {
        }
    }
}

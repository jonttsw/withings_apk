package com.withings.devicesetup.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.withings.comm.network.bluetooth.BondCreationException;
import com.withings.comm.network.common.NoResponseReceived;
import com.withings.comm.network.common.exception.ConnectionFailException;
import com.withings.comm.remote.exception.BluetoothOffException;
import com.withings.comm.remote.exception.ConnectionClosedException;
import com.withings.comm.remote.exception.ConversationTimeoutException;
import com.withings.comm.remote.exception.DeviceNotFoundException;
import com.withings.comm.remote.exception.FatalWebserviceException;
import com.withings.comm.remote.exception.RestartBluetoothException;
import com.withings.comm.remote.exception.WebserviceException;
import com.withings.comm.wpp.exception.IncorrectVersionException;
import com.withings.comm.wpp.exception.NoKlSecretProvidedException;
import com.withings.comm.wpp.exception.UnexpectedResponseException;
import com.withings.devicesetup.bonding.BondingException;
import com.withings.devicesetup.upgrade.exception.NetUpgradeException;
import com.withings.devicesetup.upgrade.exception.ReconnectionForUpgradeException;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import mj.g;
/* compiled from: SetupErrorFragment.java */
/* loaded from: classes3.dex */
public class h extends Fragment implements g.a {

    /* renamed from: c  reason: collision with root package name */
    private Exception f37916c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f37917d;

    /* renamed from: e  reason: collision with root package name */
    private mj.g f37918e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList f37919f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private b f37920g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f37921h;

    /* renamed from: i  reason: collision with root package name */
    private ImageView f37922i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f37923j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f37924k;

    /* renamed from: l  reason: collision with root package name */
    private WorkflowBar f37925l;

    /* renamed from: m  reason: collision with root package name */
    private String f37926m;

    /* compiled from: SetupErrorFragment.java */
    /* loaded from: classes3.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        public Class f37927a;

        /* renamed from: b  reason: collision with root package name */
        public int f37928b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f37929c;

        public a(Class cls, int i11, boolean z5) {
            this.f37927a = cls;
            this.f37928b = i11;
            this.f37929c = z5;
        }
    }

    /* compiled from: SetupErrorFragment.java */
    /* loaded from: classes3.dex */
    public interface b {
        void c();

        void g0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof b) {
            this.f37920g = (b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37916c = (Exception) getArguments().getSerializable("exception");
        this.f37917d = getArguments().getBoolean("showStacktrace");
        Object obj = null;
        this.f37926m = getArguments().getString("EXTRA_DEVICE_NAME", null);
        ArrayList arrayList = this.f37919f;
        arrayList.add(new a(BondCreationException.class, C1987R.string._SETUP_ERROR_MESSAGE_CONNECTION_FAILED_, false));
        arrayList.add(new a(BluetoothOffException.class, C1987R.string._BLUETOOTH_IS_OFF_, false));
        arrayList.add(new a(ConnectionFailException.class, C1987R.string._SETUP_ERROR_MESSAGE_CONNECTION_FAILED_, false));
        arrayList.add(new a(NoKlSecretProvidedException.class, C1987R.string._SETUP_ERROR_MESSAGE_ALREADY_INSTALLED_, false));
        arrayList.add(new a(ConnectionClosedException.class, C1987R.string._SETUP_ERROR_MESSAGE_CONNECTION_LOST_, false));
        arrayList.add(new a(IncorrectVersionException.class, C1987R.string._SETUP_ERROR_MESSAGE_UNEXPECTED_RESPONSE_OF_DEVICE_, true));
        arrayList.add(new a(UnexpectedResponseException.class, C1987R.string._SETUP_ERROR_MESSAGE_UNEXPECTED_RESPONSE_OF_DEVICE_, true));
        arrayList.add(new a(ReconnectionForUpgradeException.class, C1987R.string._SETUP_ERROR_MESSAGE_RECONNECTION_FAILED_, false));
        arrayList.add(new a(DeviceNotFoundException.class, C1987R.string._SETUP_ERROR_MESSAGE_RECONNECTION_FAILED_, false));
        arrayList.add(new a(NetUpgradeException.class, C1987R.string._SETUP_ERROR_MESSAGE_NET_UPGRADE_FAILED_, false));
        arrayList.add(new a(FatalWebserviceException.class, C1987R.string._SETUP_ERROR_MESSAGE_INTERNET_NEEDED_, false));
        arrayList.add(new a(WebserviceException.class, C1987R.string._SETUP_ERROR_MESSAGE_INTERNET_NEEDED_, false));
        arrayList.add(new a(NoResponseReceived.class, C1987R.string._SETUP_ERROR_MESSAGE_NO_RESPONSE_RECEIVED_, true));
        arrayList.add(new a(ConversationTimeoutException.class, C1987R.string._SETUP_ERROR_MESSAGE_WAIT_FOR_INPUT_TIMEOUT_, false));
        arrayList.add(new a(RestartBluetoothException.class, C1987R.string._RESTART_BLUETOOTH_MESSAGE_, false));
        arrayList.add(new a(BondingException.class, C1987R.string._HWA03_ERROR_PAIRING_, false));
        Iterator it = this.f37919f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f37927a.isInstance(this.f37916c)) {
                obj = next;
                break;
            }
        }
        a aVar = (a) obj;
        Exception exc = this.f37916c;
        if (exc != null) {
            if (aVar == null || aVar.f37929c) {
                x70.b.n(exc);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1987R.layout.fragment_setup_old, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        mj.g gVar = this.f37918e;
        if (gVar != null) {
            gVar.a();
            this.f37918e = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f37920g = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (((PowerManager) getContext().getSystemService("power")).isInteractive() && u70.a.b().e() && getArguments().getBoolean("EXTRA_IMMEDIATE_RETRY", false)) {
            v1();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Object obj2;
        int i11;
        super.onViewCreated(view, bundle);
        this.f37921h = (TextView) view.findViewById(C1987R.id.setup_title);
        this.f37923j = (TextView) view.findViewById(C1987R.id.setup_message);
        this.f37922i = (ImageView) view.findViewById(C1987R.id.setup_image);
        this.f37924k = (TextView) view.findViewById(C1987R.id.setup_error);
        WorkflowBar workflowBar = (WorkflowBar) view.findViewById(C1987R.id.workflowBar);
        this.f37925l = workflowBar;
        workflowBar.setLeftText(C1987R.string._CANCEL_);
        workflowBar.setRightText(C1987R.string._RETRY_);
        this.f37921h.setVisibility(0);
        int i12 = 8;
        this.f37922i.setVisibility(8);
        this.f37923j.setVisibility(4);
        this.f37924k.setVisibility(8);
        WorkflowBar workflowBar2 = this.f37925l;
        if (this.f37920g != null && !(this.f37916c instanceof RestartBluetoothException)) {
            i12 = 0;
        }
        workflowBar2.setVisibility(i12);
        this.f37925l.setRightClickListener(new f(this));
        this.f37925l.setLeftClickListener(new g(this));
        Iterator it = this.f37919f.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((a) obj2).f37927a.isInstance(this.f37916c)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            if (aVar.f37927a == ConnectionFailException.class && this.f37926m != null) {
                this.f37923j.setVisibility(0);
                this.f37923j.setText(this.f37926m);
            }
            i11 = aVar.f37928b;
        } else {
            TextView textView = this.f37924k;
            Iterator it2 = this.f37919f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((a) next).f37927a.isInstance(this.f37916c)) {
                    obj = next;
                    break;
                }
            }
            a aVar2 = (a) obj;
            Exception exc = this.f37916c;
            if (exc != null && ((aVar2 == null || aVar2.f37929c) && this.f37917d)) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                textView.setText(stringWriter.toString());
                textView.setMovementMethod(new ScrollingMovementMethod());
            } else {
                String simpleName = exc.getClass().getSimpleName();
                if (this.f37916c.getClass() == IOException.class) {
                    StringBuilder b10 = com.google.android.filament.utils.b.b(simpleName, " : ");
                    b10.append(this.f37916c.getMessage());
                    simpleName = b10.toString();
                }
                textView.setText(simpleName);
            }
            i11 = C1987R.string._SETUP_ERROR_MESSAGE_UNKNOWN_ERROR_;
        }
        this.f37921h.setText(i11);
        if (this.f37916c instanceof RestartBluetoothException) {
            mj.g gVar = new mj.g(this);
            this.f37918e = gVar;
            gVar.b();
        }
    }

    public final void u1() {
        b bVar = this.f37920g;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final void v1() {
        b bVar = this.f37920g;
        if (bVar != null) {
            bVar.c();
        }
    }

    public final void w1(b bVar) {
        this.f37920g = bVar;
    }
}

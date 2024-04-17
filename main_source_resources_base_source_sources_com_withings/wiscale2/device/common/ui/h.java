package com.withings.wiscale2.device.common.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.withings.comm.remote.exception.BluetoothOffException;
import com.withings.common.device.HelpCenterWebActivity;
import com.withings.common.device.reporting.InstallStateReporter;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.device.Device;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.user.User;
import com.withings.views.view.ToggleCellView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.zendesk.R;
import com.withings.zendesk.ui.DeviceGuideDisplayer;
import ga.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: BaseDeviceInfoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/h;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class h extends m1 {

    /* renamed from: s  reason: collision with root package name */
    public static final /* synthetic */ int f53939s = 0;

    /* renamed from: h  reason: collision with root package name */
    protected Device f53940h;

    /* renamed from: i  reason: collision with root package name */
    private nn.c f53941i;

    /* renamed from: j  reason: collision with root package name */
    private LineCellView f53942j;

    /* renamed from: k  reason: collision with root package name */
    private ToggleCellView f53943k;

    /* renamed from: l  reason: collision with root package name */
    protected List<? extends View> f53944l;

    /* renamed from: m  reason: collision with root package name */
    private LineCellView f53945m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f53946n = nm0.h.b(new b());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f53947o = nm0.h.b(a.f53951a);

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f53948p = nm0.h.b(c.f53953a);
    @Inject

    /* renamed from: q  reason: collision with root package name */
    public ch.l f53949q;
    @Inject

    /* renamed from: r  reason: collision with root package name */
    public com.withings.device.details.c0 f53950r;

    /* compiled from: BaseDeviceInfoFragment.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<kn.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f53951a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final kn.e invoke() {
            return kn.e.c();
        }
    }

    /* compiled from: BaseDeviceInfoFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<zh0.j> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final zh0.j invoke() {
            Context requireContext = h.this.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            return new zh0.j(requireContext);
        }
    }

    /* compiled from: BaseDeviceInfoFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<m70.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f53953a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final m70.i invoke() {
            return m70.i.b();
        }
    }

    private static void O1(androidx.appcompat.app.c cVar) {
        int[] iArr = {-1, -2, -3};
        ArrayList arrayList = new ArrayList(3);
        for (int i11 = 0; i11 < 3; i11++) {
            arrayList.add(cVar.g(iArr[i11]));
        }
        Iterator it = kotlin.collections.x.G(arrayList).iterator();
        while (it.hasNext()) {
            Button button = (Button) it.next();
            button.setGravity(8388627);
            button.setAllCaps(false);
        }
    }

    public static void s1(h this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(view, "$view");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new j(context, this$0, null), 3, null);
    }

    public static void t1(h this$0, androidx.appcompat.app.c dialog) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(dialog, "$dialog");
        O1(dialog);
    }

    public static void u1(h this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        int i11 = v70.a.f103433b;
        v70.a.e("device_settings_look_for_update", "device_settings_look_for_update", kotlin.collections.s0.i(new nm0.j("device_model", Integer.valueOf(this$0.F1().getModelId()))), false, 8);
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this$0.K1(context);
    }

    public static void v1(h this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this$0.K1(context);
    }

    public static void w1(h this$0, androidx.appcompat.app.c dialog) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(dialog, "$dialog");
        O1(dialog);
    }

    public static void x1(h this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this$0.M1(context);
    }

    public static void y1(h this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this$0.J1(context);
    }

    public static final void z1(h hVar, Throwable th2) {
        Context context = hVar.getContext();
        if (context != null) {
            if (th2 instanceof BluetoothOffException) {
                qc.b bVar = new qc.b(context);
                bVar.C(C1987R.string.activate_bluetooth_notification);
                bVar.x(C1987R.string._OK_, null);
                bVar.create().show();
                return;
            }
            Toast.makeText(context, (int) C1987R.string.device_dissociationFailed_description, 1).show();
        }
    }

    public final void A1(final View view, final ym0.a<nm0.y> aVar) {
        kotlin.jvm.internal.u.j(view, "view");
        qc.b bVar = new qc.b(view.getContext());
        bVar.C(C1987R.string.deviceTab_how_do_you_want_dissociate);
        qc.b w11 = bVar.z(C1987R.string.device_dissociationAccounts_description, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.device.common.ui.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                int i12 = h.f53939s;
                h this$0 = this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                View view2 = view;
                kotlin.jvm.internal.u.j(view2, "$view");
                ym0.a aVar2 = ym0.a.this;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                Context context = view2.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new i(context, this$0, null), 3, null);
            }
        }).w(C1987R.string.device_dissociationOtherAccounts_description, new p40.a(1, this, view));
        w11.x(C1987R.string._CANCEL_, null);
        final androidx.appcompat.app.c create = w11.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withings.wiscale2.device.common.ui.g
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                h.t1(h.this, create);
            }
        });
        create.show();
    }

    public final void B1(final View view) {
        kotlin.jvm.internal.u.j(view, "view");
        qc.b bVar = new qc.b(view.getContext());
        bVar.C(C1987R.string.device_dissociationConfirmation_title);
        bVar.g(C1987R.string.device_dissociationAccounts_description);
        final androidx.appcompat.app.c create = bVar.z(C1987R.string._OK_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.device.common.ui.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                int i12 = h.f53939s;
                h this$0 = h.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                View view2 = view;
                kotlin.jvm.internal.u.j(view2, "$view");
                Context context = view2.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new k(context, this$0, null), 3, null);
            }
        }).w(C1987R.string._CANCEL_, null).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withings.wiscale2.device.common.ui.d
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                h.w1(h.this, create);
            }
        });
        create.show();
    }

    public final User C1() {
        Long userId = F1().getUserId();
        if (userId != null) {
            return I1().i(userId.longValue());
        }
        return null;
    }

    public final nn.c D1() {
        return this.f53941i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LineCellView E1() {
        return this.f53942j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Device F1() {
        Device device = this.f53940h;
        if (device != null) {
            return device;
        }
        kotlin.jvm.internal.u.s("device");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kn.e G1() {
        Object value = this.f53947o.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (kn.e) value;
    }

    public abstract int H1();

    /* JADX INFO: Access modifiers changed from: protected */
    public final m70.i I1() {
        Object value = this.f53948p.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (m70.i) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J1(Context context) {
        Object systemService = context.getSystemService("clipboard");
        kotlin.jvm.internal.u.h(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("device_serial", F1().getMacAddress().toString()));
        Toast.makeText(context, (int) C1987R.string._MAC_COPIED_TO_CLIPBOARD_, 0).show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K1(Context context) {
        fl.o g11 = fl.p.f67672b.a().g(F1());
        if (g11 instanceof gl.f) {
            startActivity(SetupActivity.P3(context, ((gl.f) g11).U(F1()), jl.a.b(F1()), new InstallStateReporter(false)));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L1(Context context, Device device) {
        int i11;
        if (ah.g.p(device) == 1) {
            i11 = C1987R.string.bpm_hypertension_table_url_us;
        } else {
            i11 = C1987R.string.bpm_hypertension_table_url;
        }
        Intent b10 = HMWebActivity.f35395c.b(context, null, i11);
        b10.setClass(context, HelpCenterWebActivity.class);
        if (wq.b.a(context, b10)) {
            startActivity(b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M1(Context context) {
        nm0.y yVar;
        kotlin.jvm.internal.u.j(context, "context");
        if (((ComposeView) requireView().findViewById(C1987R.id.section_help_center)) != null) {
            ch.l lVar = this.f53949q;
            if (lVar != null) {
                startActivity(DeviceGuideDisplayer.getZendeskIntent(lVar, context, F1(), C1()));
                yVar = nm0.y.f85009a;
            } else {
                kotlin.jvm.internal.u.s("webIntentBuilder");
                throw null;
            }
        } else {
            yVar = null;
        }
        if (yVar == null) {
            fl.o d11 = fl.p.f67672b.a().d(F1().getModelId());
            ch.l lVar2 = this.f53949q;
            if (lVar2 != null) {
                String string = getString(d11.I(F1().getColor()));
                kotlin.jvm.internal.u.i(string, "getString(...)");
                com.withings.common.device.r.c(lVar2, context, d11, string);
                return;
            }
            kotlin.jvm.internal.u.s("webIntentBuilder");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void N1() {
        fl.o d11 = fl.p.f67672b.a().d(F1().getModelId());
        int E = d11.E(F1().getColor());
        if (E > 0) {
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            Context requireContext = requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            String string = getString(d11.I(F1().getColor()));
            String string2 = getString(E);
            kotlin.jvm.internal.u.i(string2, "getString(...)");
            Intent c11 = aVar.c(requireContext, string, string2);
            c11.setClass(requireContext(), HelpCenterWebActivity.class);
            FragmentActivity activity = getActivity();
            if (activity != null && c11.resolveActivity(activity.getPackageManager()) != null) {
                startActivity(c11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P1(final String str, final LineCellView nameEdit) {
        kotlin.jvm.internal.u.j(nameEdit, "nameEdit");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View inflate = activity.getLayoutInflater().inflate(C1987R.layout.view_edit_name, (ViewGroup) null);
            final EditText editText = (EditText) inflate.findViewById(C1987R.id.edit_text);
            editText.setText(str);
            androidx.appcompat.app.c create = new qc.b(activity).D(inflate).z(17039370, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.device.common.ui.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    int i12 = h.f53939s;
                    h this$0 = h.this;
                    kotlin.jvm.internal.u.j(this$0, "this$0");
                    String oldName = str;
                    kotlin.jvm.internal.u.j(oldName, "$oldName");
                    LineCellView nameEdit2 = nameEdit;
                    kotlin.jvm.internal.u.j(nameEdit2, "$nameEdit");
                    String obj = editText.getText().toString();
                    nameEdit2.setValue(obj);
                    BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), Dispatchers.getIO(), null, new m(this$0, obj, nameEdit2, oldName, null), 2, null);
                }
            }).w(17039360, null).create();
            Window window = create.getWindow();
            if (window != null) {
                window.setSoftInputMode(5);
            }
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R1(Device device) {
        kotlin.jvm.internal.u.j(device, "<set-?>");
        this.f53940h = device;
    }

    @Override // com.withings.wiscale2.device.common.ui.m1, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f53941i = (nn.c) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        Bundle a11 = yq.b.a(this);
        if (Build.VERSION.SDK_INT >= 33) {
            obj = com.withings.wiscale2.device.common.ui.b.a(a11);
        } else {
            Serializable serializable = a11.getSerializable("EXTRA_DEVICE");
            if (!(serializable instanceof Device)) {
                serializable = null;
            }
            obj = (Device) serializable;
        }
        kotlin.jvm.internal.u.g(obj);
        this.f53940h = (Device) obj;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(H1(), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        boolean z5;
        super.onDestroyView();
        ToggleCellView toggleCellView = this.f53943k;
        if (toggleCellView != null && F1().isSyncDisabled() != (z5 = toggleCellView.z())) {
            F1().setSyncDisabled(z5);
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getIO(), null, new l(this, null), 2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f53941i = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String url;
        int i11;
        int i12;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        this.f53945m = (LineCellView) view.findViewById(C1987R.id.device_last_value);
        this.f53942j = (LineCellView) view.findViewById(C1987R.id.button_check_for_update);
        this.f53944l = kotlin.collections.l.z(new View[]{view.findViewById(C1987R.id.hwa_settings_section_view), view.findViewById(C1987R.id.button_update)});
        view.findViewById(C1987R.id.device_serial).setOnClickListener(new gi.e(this, 5));
        View findViewById = view.findViewById(C1987R.id.button_update);
        if (findViewById != null) {
            findViewById.setOnClickListener(new gi.f(this, 11));
        }
        ToggleCellView toggleCellView = (ToggleCellView) view.findViewById(C1987R.id.toggle_sync);
        if (toggleCellView != null) {
            this.f53943k = toggleCellView;
            toggleCellView.setVisibility(8);
            toggleCellView.setChecked(F1().isSyncDisabled());
        }
        LineCellView lineCellView = this.f53942j;
        if (lineCellView != null) {
            lineCellView.setOnClickListener(new androidx.viewpager.widget.c(this, 10));
        }
        LineCellView lineCellView2 = this.f53942j;
        if (lineCellView2 != null) {
            String upgradeUrl = F1().getUpgradeUrl();
            if (upgradeUrl != null && upgradeUrl.length() != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            lineCellView2.setVisibility(i12);
        }
        List<? extends View> list = this.f53944l;
        DateTime dateTime = null;
        if (list != null) {
            for (View view2 : list) {
                String upgradeUrl2 = F1().getUpgradeUrl();
                if (upgradeUrl2 != null && upgradeUrl2.length() > 0) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                view2.setVisibility(i11);
            }
            LineCellView lineCellView3 = this.f53945m;
            if (lineCellView3 != null) {
                DateTime lastUseDate = F1().getLastUseDate();
                if (lastUseDate.getMillis() == 0) {
                    lastUseDate = null;
                }
                if (lastUseDate == null) {
                    lastUseDate = F1().getAssociationDate();
                }
                u70.i macAddress = F1().getMacAddress();
                kotlin.jvm.internal.u.i(macAddress, "getMacAddress(...)");
                DateTime a11 = ((zh0.j) this.f53946n.getValue()).a(macAddress);
                if (a11 != null) {
                    if (a11.isAfter(lastUseDate)) {
                        dateTime = a11;
                    }
                    if (dateTime != null) {
                        lastUseDate = dateTime;
                    }
                }
                kotlin.jvm.internal.u.g(lastUseDate);
                Context context = lineCellView3.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                lineCellView3.setSecondaryLabel(b50.b.l(context, lastUseDate));
            }
            View findViewById2 = view.findViewById(C1987R.id.device_faq);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new androidx.viewpager.widget.d(this, 5));
            }
            ComposeView composeView = (ComposeView) view.findViewById(C1987R.id.section_help_center);
            if (composeView != null) {
                composeView.setContent(new s1.a(true, 362911316, new p(this)));
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.product_image);
            if (imageView != null) {
                DevicePictures pictures = F1().getPictures();
                fl.o g11 = fl.p.f67672b.a().g(F1());
                if (pictures != null && (url = pictures.getUrl(1)) != null) {
                    w9.g a12 = w9.a.a(imageView.getContext());
                    f.a aVar = new f.a(imageView.getContext());
                    aVar.d(url);
                    aVar.q(imageView);
                    aVar.k(g11.M(F1().getColor()));
                    a12.d(aVar.b());
                    return;
                }
                imageView.setImageResource(g11.M(F1().getColor()));
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("settingsSectionViews");
        throw null;
    }
}

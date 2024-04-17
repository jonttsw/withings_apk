package com.withings.wiscale2.device.common.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: DeviceBondingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/s;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class s extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private v f54072c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f54073d;

    /* compiled from: DeviceBondingActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(String str) {
            String str2 = str;
            if (str2 != null) {
                s.s1(s.this, str2);
            }
            return nm0.y.f85009a;
        }
    }

    public s() {
        super(C1987R.layout.fragment_bonding_fail);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void s1(s sVar, String str) {
        String str2;
        v vVar = sVar.f54072c;
        if (vVar != null) {
            if (vVar.k0()) {
                TextView textView = sVar.f54073d;
                if (textView != null) {
                    switch (str.hashCode()) {
                        case -1566110004:
                            if (str.equals("deviceFound")) {
                                TextView textView2 = sVar.f54073d;
                                if (textView2 != null) {
                                    str2 = textView2.getContext().getString(C1987R.string._BT_POPUP_CONNECTING_TITLE_);
                                    break;
                                } else {
                                    kotlin.jvm.internal.u.s("connectionStateView");
                                    throw null;
                                }
                            }
                            str2 = "";
                            break;
                        case -995321554:
                            if (str.equals("paused")) {
                                TextView textView3 = sVar.f54073d;
                                if (textView3 != null) {
                                    str2 = textView3.getContext().getString(C1987R.string._HWA01_NOT_FOUND_DETAIL_);
                                    break;
                                } else {
                                    kotlin.jvm.internal.u.s("connectionStateView");
                                    throw null;
                                }
                            }
                            str2 = "";
                            break;
                        case -775651656:
                            if (str.equals("connecting")) {
                                TextView textView4 = sVar.f54073d;
                                if (textView4 != null) {
                                    str2 = textView4.getContext().getString(C1987R.string._BT_POPUP_CONNECTING_TITLE_);
                                    break;
                                } else {
                                    kotlin.jvm.internal.u.s("connectionStateView");
                                    throw null;
                                }
                            }
                            str2 = "";
                            break;
                        case -579210487:
                            if (str.equals("connected")) {
                                TextView textView5 = sVar.f54073d;
                                if (textView5 != null) {
                                    str2 = textView5.getContext().getString(C1987R.string._SERVICE_CONNECTED_);
                                    break;
                                } else {
                                    kotlin.jvm.internal.u.s("connectionStateView");
                                    throw null;
                                }
                            }
                            str2 = "";
                            break;
                        case 1778217274:
                            if (str.equals("searching")) {
                                TextView textView6 = sVar.f54073d;
                                if (textView6 != null) {
                                    str2 = textView6.getContext().getString(C1987R.string._HWA03_SEARCHING_DETAILS_);
                                    break;
                                } else {
                                    kotlin.jvm.internal.u.s("connectionStateView");
                                    throw null;
                                }
                            }
                            str2 = "";
                            break;
                        case 2043233520:
                            if (str.equals("conversing")) {
                                TextView textView7 = sVar.f54073d;
                                if (textView7 != null) {
                                    str2 = textView7.getContext().getString(C1987R.string._SERVICE_CONNECTED_);
                                    break;
                                } else {
                                    kotlin.jvm.internal.u.s("connectionStateView");
                                    throw null;
                                }
                            }
                            str2 = "";
                            break;
                        default:
                            str2 = "";
                            break;
                    }
                    textView.setText(str2);
                    return;
                }
                kotlin.jvm.internal.u.s("connectionStateView");
                throw null;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f54072c = ((DeviceBondingActivity) context).C3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        v vVar = this.f54072c;
        if (vVar != null) {
            vVar.i0().removeObservers(this);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        View findViewById = view.findViewById(C1987R.id.connection_state);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f54073d = (TextView) findViewById;
        v vVar = this.f54072c;
        if (vVar != null) {
            xw.d.c(this, vVar.i0(), new a());
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }
}

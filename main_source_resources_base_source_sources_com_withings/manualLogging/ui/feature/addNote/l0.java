package com.withings.manualLogging.ui.feature.addNote;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.manualLogging.ui.uikit.atoms.ManualLogCategory;
import com.withings.user.User;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.l<ManualLogCategory, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41507a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f41508b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f41509c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f41510d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(AddManualLogActivity addManualLogActivity, User user, r8.n nVar, Context context) {
        super(1);
        this.f41507a = addManualLogActivity;
        this.f41508b = user;
        this.f41509c = nVar;
        this.f41510d = context;
    }

    @Override // ym0.l
    public final nm0.y invoke(ManualLogCategory manualLogCategory) {
        String str;
        ManualLogCategory selectedCategory = manualLogCategory;
        kotlin.jvm.internal.u.j(selectedCategory, "selectedCategory");
        int ordinal = selectedCategory.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 6) {
                            if (ordinal != 7) {
                                if (ordinal != 9) {
                                    if (ordinal != 11) {
                                        str = null;
                                    } else {
                                        str = "cycle";
                                    }
                                } else {
                                    str = "weight";
                                }
                            } else {
                                str = "sleep";
                            }
                        } else {
                            str = "nutrition";
                        }
                    } else {
                        str = "hr";
                    }
                } else {
                    str = "temperature";
                }
            } else {
                str = "blood_pressure";
            }
        } else {
            str = "activity";
        }
        if (str != null) {
            int i11 = v70.a.f103433b;
            v70.a.e("manual_logging_selection", "manual_logging_selection", kotlin.collections.s0.i(new nm0.j("measure_type", str)), false, 8);
        }
        ManualLogCategory manualLogCategory2 = ManualLogCategory.f41647o;
        User user = this.f41508b;
        AddManualLogActivity addManualLogActivity = this.f41507a;
        if (selectedCategory == manualLogCategory2) {
            kotlin.jvm.internal.u.i(user, "$user");
            AddManualLogActivity.H3(addManualLogActivity, 1, user);
        } else if (selectedCategory == ManualLogCategory.f41641i) {
            kotlin.jvm.internal.u.i(user, "$user");
            AddManualLogActivity.H3(addManualLogActivity, 11, user);
        } else if (selectedCategory == ManualLogCategory.f41639g) {
            kotlin.jvm.internal.u.i(user, "$user");
            AddManualLogActivity.H3(addManualLogActivity, 9, user);
        } else if (selectedCategory == ManualLogCategory.f41640h) {
            kotlin.jvm.internal.u.i(user, "$user");
            AddManualLogActivity.H3(addManualLogActivity, 71, user);
        } else if (selectedCategory == ManualLogCategory.f41638f) {
            kotlin.jvm.internal.u.i(user, "$user");
            AddManualLogActivity.F3(addManualLogActivity, user);
        } else if (selectedCategory == ManualLogCategory.f41648p) {
            kotlin.jvm.internal.u.i(user, "$user");
            AddManualLogActivity.H3(addManualLogActivity, 4, user);
        } else if (selectedCategory == ManualLogCategory.f41644l) {
            int i12 = AddManualLogActivity.f40697k;
            addManualLogActivity.getClass();
            Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(addManualLogActivity.getPackageName(), "com.withings.wiscale2.food.ui.setup.FoodSetupActivity").putExtra("EXTRA_SHOW_AGREEMENT", false);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            addManualLogActivity.startActivity(putExtra);
        } else if (selectedCategory == ManualLogCategory.f41645m) {
            kotlin.jvm.internal.u.i(user, "$user");
            int i13 = AddManualLogActivity.f40697k;
            addManualLogActivity.getClass();
            Intent putExtra2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(addManualLogActivity.getPackageName(), "com.withings.wiscale2.manuallogging.ui.addSleep.AddSleepTrackActivity").putExtra("EXTRA_USER", user.q());
            kotlin.jvm.internal.u.i(putExtra2, "putExtra(...)");
            addManualLogActivity.startActivity(putExtra2);
        } else if (selectedCategory == ManualLogCategory.f41649q) {
            AddManualLogActivity.G3(addManualLogActivity, user.q());
        } else if (AddManualLogActivity.E3(addManualLogActivity, selectedCategory)) {
            androidx.navigation.e.L(this.f41509c, androidx.activity.a0.b("addManualLogScreen/", selectedCategory.name()), null, 6);
        } else {
            Toast.makeText(this.f41510d, "Not implemented yet!", 1).show();
        }
        return nm0.y.f85009a;
    }
}

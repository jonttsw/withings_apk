package com.withings.wiscale2.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.medicalreport.ui.MedicalReportActivity;
import com.withings.user.User;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: ProfileMedicalReportView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/wiscale2/profile/ProfileMedicalReportView;", "Landroid/widget/LinearLayout;", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lnm0/y;", "setUser", "(Lcom/withings/user/User;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProfileMedicalReportView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private SectionView f59268a;

    /* renamed from: b  reason: collision with root package name */
    private User f59269b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileMedicalReportView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    public static void a(ProfileMedicalReportView this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.c();
    }

    public static void b(ProfileMedicalReportView this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.c();
    }

    private final void c() {
        Context context = getContext();
        MedicalReportActivity.a aVar = MedicalReportActivity.f42172p;
        Context context2 = this.f59268a.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        User user = this.f59269b;
        if (user != null) {
            String l5 = user.l();
            kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
            User user2 = this.f59269b;
            if (user2 != null) {
                String s11 = user2.s();
                kotlin.jvm.internal.u.i(s11, "getLastName(...)");
                aVar.getClass();
                context.startActivity(MedicalReportActivity.a.a(context2, l5, s11));
                return;
            }
            kotlin.jvm.internal.u.s(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
            throw null;
        }
        kotlin.jvm.internal.u.s(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        throw null;
    }

    public final void setUser(User user) {
        kotlin.jvm.internal.u.j(user, "user");
        this.f59269b = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMedicalReportView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C1987R.layout.profile_medical_report_view, this);
        View findViewById = inflate.findViewById(C1987R.id.medical_report_card);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        findViewById.setOnClickListener(new sg.f(this, 19));
        View findViewById2 = inflate.findViewById(C1987R.id.medical_report_section_header);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        SectionView sectionView = (SectionView) findViewById2;
        this.f59268a = sectionView;
        sectionView.setActionClickListener(new sg.g(this, 18));
    }
}

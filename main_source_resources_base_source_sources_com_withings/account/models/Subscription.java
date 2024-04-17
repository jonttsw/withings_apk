package com.withings.account.models;

import androidx.camera.core.y1;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: Subscription.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/withings/account/models/Subscription;", "", "discount", "", "newsletter", "study", "report", RemoteMessageConst.NOTIFICATION, ConstantsWs.WELLNESS_TASK_TYPE_SURVEY, "(ZZZZZZ)V", "getDiscount", "()Z", "setDiscount", "(Z)V", "getNewsletter", "setNewsletter", "getNotification", "setNotification", "getReport", "setReport", "getStudy", "setStudy", "getSurvey", "setSurvey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Subscription {
    public static final int $stable = 8;
    private boolean discount;
    private boolean newsletter;
    private boolean notification;
    private boolean report;
    private boolean study;
    private boolean survey;

    public Subscription() {
        this(false, false, false, false, false, false, 63, null);
    }

    public static /* synthetic */ Subscription copy$default(Subscription subscription, boolean z5, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z5 = subscription.discount;
        }
        if ((i11 & 2) != 0) {
            z11 = subscription.newsletter;
        }
        boolean z16 = z11;
        if ((i11 & 4) != 0) {
            z12 = subscription.study;
        }
        boolean z17 = z12;
        if ((i11 & 8) != 0) {
            z13 = subscription.report;
        }
        boolean z18 = z13;
        if ((i11 & 16) != 0) {
            z14 = subscription.notification;
        }
        boolean z19 = z14;
        if ((i11 & 32) != 0) {
            z15 = subscription.survey;
        }
        return subscription.copy(z5, z16, z17, z18, z19, z15);
    }

    public final boolean component1() {
        return this.discount;
    }

    public final boolean component2() {
        return this.newsletter;
    }

    public final boolean component3() {
        return this.study;
    }

    public final boolean component4() {
        return this.report;
    }

    public final boolean component5() {
        return this.notification;
    }

    public final boolean component6() {
        return this.survey;
    }

    public final Subscription copy(boolean z5, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        return new Subscription(z5, z11, z12, z13, z14, z15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (this.discount == subscription.discount && this.newsletter == subscription.newsletter && this.study == subscription.study && this.report == subscription.report && this.notification == subscription.notification && this.survey == subscription.survey) {
            return true;
        }
        return false;
    }

    public final boolean getDiscount() {
        return this.discount;
    }

    public final boolean getNewsletter() {
        return this.newsletter;
    }

    public final boolean getNotification() {
        return this.notification;
    }

    public final boolean getReport() {
        return this.report;
    }

    public final boolean getStudy() {
        return this.study;
    }

    public final boolean getSurvey() {
        return this.survey;
    }

    public int hashCode() {
        return Boolean.hashCode(this.survey) + y1.a(this.notification, y1.a(this.report, y1.a(this.study, y1.a(this.newsletter, Boolean.hashCode(this.discount) * 31, 31), 31), 31), 31);
    }

    public final void setDiscount(boolean z5) {
        this.discount = z5;
    }

    public final void setNewsletter(boolean z5) {
        this.newsletter = z5;
    }

    public final void setNotification(boolean z5) {
        this.notification = z5;
    }

    public final void setReport(boolean z5) {
        this.report = z5;
    }

    public final void setStudy(boolean z5) {
        this.study = z5;
    }

    public final void setSurvey(boolean z5) {
        this.survey = z5;
    }

    public String toString() {
        boolean z5 = this.discount;
        boolean z11 = this.newsletter;
        boolean z12 = this.study;
        boolean z13 = this.report;
        boolean z14 = this.notification;
        boolean z15 = this.survey;
        return "Subscription(discount=" + z5 + ", newsletter=" + z11 + ", study=" + z12 + ", report=" + z13 + ", notification=" + z14 + ", survey=" + z15 + ")";
    }

    public Subscription(boolean z5, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.discount = z5;
        this.newsletter = z11;
        this.study = z12;
        this.report = z13;
        this.notification = z14;
        this.survey = z15;
    }

    public /* synthetic */ Subscription(boolean z5, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i11, m mVar) {
        this((i11 & 1) != 0 ? false : z5, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? false : z14, (i11 & 32) != 0 ? false : z15);
    }
}

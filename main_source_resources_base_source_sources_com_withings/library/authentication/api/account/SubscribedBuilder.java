package com.withings.library.authentication.api.account;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: AccountContextBuilder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/withings/library/authentication/api/account/SubscribedBuilder;", "", "discount", "", "newsletter", ConstantsWs.WELLNESS_TASK_TYPE_SURVEY, "study", "report", RemoteMessageConst.NOTIFICATION, "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getDiscount", "()Ljava/lang/Boolean;", "setDiscount", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNewsletter", "setNewsletter", "getNotification", "setNotification", "getReport", "setReport", "getStudy", "setStudy", "getSurvey", "setSurvey", "build", "Lcom/withings/library/authentication/api/account/Subscribed;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SubscribedBuilder {
    private Boolean discount;
    private Boolean newsletter;
    private Boolean notification;
    private Boolean report;
    private Boolean study;
    private Boolean survey;

    public SubscribedBuilder() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final Subscribed build() {
        return new Subscribed(this.discount, this.newsletter, this.survey, this.study, this.report, this.notification);
    }

    public final SubscribedBuilder discount(boolean z5) {
        this.discount = Boolean.valueOf(z5);
        return this;
    }

    public final Boolean getDiscount() {
        return this.discount;
    }

    public final Boolean getNewsletter() {
        return this.newsletter;
    }

    public final Boolean getNotification() {
        return this.notification;
    }

    public final Boolean getReport() {
        return this.report;
    }

    public final Boolean getStudy() {
        return this.study;
    }

    public final Boolean getSurvey() {
        return this.survey;
    }

    public final SubscribedBuilder newsletter(boolean z5) {
        this.newsletter = Boolean.valueOf(z5);
        return this;
    }

    public final SubscribedBuilder notification(boolean z5) {
        this.notification = Boolean.valueOf(z5);
        return this;
    }

    public final SubscribedBuilder report(boolean z5) {
        this.report = Boolean.valueOf(z5);
        return this;
    }

    public final void setDiscount(Boolean bool) {
        this.discount = bool;
    }

    public final void setNewsletter(Boolean bool) {
        this.newsletter = bool;
    }

    public final void setNotification(Boolean bool) {
        this.notification = bool;
    }

    public final void setReport(Boolean bool) {
        this.report = bool;
    }

    public final void setStudy(Boolean bool) {
        this.study = bool;
    }

    public final void setSurvey(Boolean bool) {
        this.survey = bool;
    }

    public final SubscribedBuilder study(boolean z5) {
        this.study = Boolean.valueOf(z5);
        return this;
    }

    public final SubscribedBuilder survey(boolean z5) {
        this.survey = Boolean.valueOf(z5);
        return this;
    }

    public SubscribedBuilder(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.discount = bool;
        this.newsletter = bool2;
        this.survey = bool3;
        this.study = bool4;
        this.report = bool5;
        this.notification = bool6;
    }

    public /* synthetic */ SubscribedBuilder(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : bool3, (i11 & 8) != 0 ? null : bool4, (i11 & 16) != 0 ? null : bool5, (i11 & 32) != 0 ? null : bool6);
    }
}

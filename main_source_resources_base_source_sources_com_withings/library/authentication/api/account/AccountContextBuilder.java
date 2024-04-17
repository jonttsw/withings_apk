package com.withings.library.authentication.api.account;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.updateaccount.units.DistanceUnit;
import com.withings.library.authentication.updateaccount.units.HeightUnit;
import com.withings.library.authentication.updateaccount.units.TemperatureUnit;
import com.withings.library.authentication.updateaccount.units.WeightUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AccountContextBuilder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\nJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\nJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/withings/library/authentication/api/account/AccountContextBuilder;", "", "()V", "sharedUnit", "Lcom/withings/library/authentication/api/account/SharedUnitBuilder;", "subscribed", "Lcom/withings/library/authentication/api/account/SubscribedBuilder;", "build", "Lcom/withings/library/authentication/api/account/AccountContext;", "discount", "", "distance", "Lcom/withings/library/authentication/updateaccount/units/DistanceUnit;", "height", "Lcom/withings/library/authentication/updateaccount/units/HeightUnit;", "newsletter", RemoteMessageConst.NOTIFICATION, "report", "study", "isSubscribed", ConstantsWs.WELLNESS_TASK_TYPE_SURVEY, "temperature", "Lcom/withings/library/authentication/updateaccount/units/TemperatureUnit;", "weight", "Lcom/withings/library/authentication/updateaccount/units/WeightUnit;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountContextBuilder {
    private final SubscribedBuilder subscribed = new SubscribedBuilder(null, null, null, null, null, null, 63, null);
    private final SharedUnitBuilder sharedUnit = new SharedUnitBuilder(null, null, null, null, 15, null);

    public final AccountContext build() {
        return new AccountContext(this.subscribed.build(), this.sharedUnit.build());
    }

    public final AccountContextBuilder discount(boolean z5) {
        this.subscribed.discount(z5);
        return this;
    }

    public final AccountContextBuilder distance(DistanceUnit distance) {
        u.j(distance, "distance");
        this.sharedUnit.distance(distance.getValue$Authentication_release());
        return this;
    }

    public final AccountContextBuilder height(HeightUnit height) {
        u.j(height, "height");
        this.sharedUnit.height(height.getValue$Authentication_release());
        return this;
    }

    public final AccountContextBuilder newsletter(boolean z5) {
        this.subscribed.newsletter(z5);
        return this;
    }

    public final AccountContextBuilder notification(boolean z5) {
        this.subscribed.notification(z5);
        return this;
    }

    public final AccountContextBuilder report(boolean z5) {
        this.subscribed.report(z5);
        return this;
    }

    public final AccountContextBuilder study(boolean z5) {
        this.subscribed.study(z5);
        return this;
    }

    public final AccountContextBuilder subscribed(boolean z5) {
        discount(z5).newsletter(z5).survey(z5).report(z5).notification(z5).study(z5);
        return this;
    }

    public final AccountContextBuilder survey(boolean z5) {
        this.subscribed.survey(z5);
        return this;
    }

    public final AccountContextBuilder temperature(TemperatureUnit temperature) {
        u.j(temperature, "temperature");
        this.sharedUnit.temperature(temperature.getValue$Authentication_release());
        return this;
    }

    public final AccountContextBuilder weight(WeightUnit weight) {
        u.j(weight, "weight");
        this.sharedUnit.weight(weight.getValue$Authentication_release());
        return this;
    }
}

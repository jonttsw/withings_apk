package com.withings.library.authentication.api.account;

import com.withings.library.authentication.updateaccount.units.SharedUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
/* compiled from: AccountContext.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0007\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"jsonParser", "Lkotlinx/serialization/json/Json;", "toJson", "", "Lcom/withings/library/authentication/api/account/AccountContext;", "updateContextFromAccountContext", "accountContext", "updateContextFromJson", "accountContextJson", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountContextKt {
    private static final Json jsonParser = JsonKt.Json$default(null, AccountContextKt$jsonParser$1.INSTANCE, 1, null);

    public static final String toJson(AccountContext accountContext) {
        u.j(accountContext, "<this>");
        Json json = jsonParser;
        json.getSerializersModule();
        return json.encodeToJsonElement(AccountContext.Companion.serializer(), accountContext).toString();
    }

    public static final String updateContextFromAccountContext(AccountContext accountContext, AccountContext accountContext2) {
        Boolean discount;
        Boolean newsletter;
        Boolean survey;
        Boolean study;
        Boolean report;
        Boolean notification;
        Integer distance;
        Integer height;
        Integer temperature;
        Integer weight;
        u.j(accountContext, "<this>");
        u.j(accountContext2, "accountContext");
        AccountContextBuilder accountContextBuilder = new AccountContextBuilder();
        Boolean discount2 = accountContext2.getSubscribed().getDiscount();
        if ((discount2 == null || accountContextBuilder.discount(discount2.booleanValue()) == null) && (discount = accountContext.getSubscribed().getDiscount()) != null) {
            accountContextBuilder.discount(discount.booleanValue());
        }
        Boolean newsletter2 = accountContext2.getSubscribed().getNewsletter();
        if ((newsletter2 == null || accountContextBuilder.newsletter(newsletter2.booleanValue()) == null) && (newsletter = accountContext.getSubscribed().getNewsletter()) != null) {
            accountContextBuilder.newsletter(newsletter.booleanValue());
        }
        Boolean survey2 = accountContext2.getSubscribed().getSurvey();
        if ((survey2 == null || accountContextBuilder.survey(survey2.booleanValue()) == null) && (survey = accountContext.getSubscribed().getSurvey()) != null) {
            accountContextBuilder.survey(survey.booleanValue());
        }
        Boolean study2 = accountContext2.getSubscribed().getStudy();
        if ((study2 == null || accountContextBuilder.study(study2.booleanValue()) == null) && (study = accountContext.getSubscribed().getStudy()) != null) {
            accountContextBuilder.study(study.booleanValue());
        }
        Boolean report2 = accountContext2.getSubscribed().getReport();
        if ((report2 == null || accountContextBuilder.report(report2.booleanValue()) == null) && (report = accountContext.getSubscribed().getReport()) != null) {
            accountContextBuilder.report(report.booleanValue());
        }
        Boolean notification2 = accountContext2.getSubscribed().getNotification();
        if ((notification2 == null || accountContextBuilder.notification(notification2.booleanValue()) == null) && (notification = accountContext.getSubscribed().getNotification()) != null) {
            accountContextBuilder.notification(notification.booleanValue());
        }
        Integer distance2 = accountContext2.getSharedUnit().getDistance();
        if ((distance2 == null || accountContextBuilder.distance(SharedUnitKt.toDistanceUnit(distance2.intValue())) == null) && (distance = accountContext.getSharedUnit().getDistance()) != null) {
            accountContextBuilder.distance(SharedUnitKt.toDistanceUnit(distance.intValue()));
        }
        Integer height2 = accountContext2.getSharedUnit().getHeight();
        if ((height2 == null || accountContextBuilder.height(SharedUnitKt.toHeightUnit(height2.intValue())) == null) && (height = accountContext.getSharedUnit().getHeight()) != null) {
            accountContextBuilder.height(SharedUnitKt.toHeightUnit(height.intValue()));
        }
        Integer temperature2 = accountContext2.getSharedUnit().getTemperature();
        if ((temperature2 == null || accountContextBuilder.temperature(SharedUnitKt.toTemperatureUnit(temperature2.intValue())) == null) && (temperature = accountContext.getSharedUnit().getTemperature()) != null) {
            accountContextBuilder.temperature(SharedUnitKt.toTemperatureUnit(temperature.intValue()));
        }
        Integer weight2 = accountContext2.getSharedUnit().getWeight();
        if ((weight2 == null || accountContextBuilder.weight(SharedUnitKt.toWeightUnit(weight2.intValue())) == null) && (weight = accountContext.getSharedUnit().getWeight()) != null) {
            accountContextBuilder.weight(SharedUnitKt.toWeightUnit(weight.intValue()));
        }
        return toJson(accountContextBuilder.build());
    }

    public static final String updateContextFromJson(AccountContext accountContext, String accountContextJson) {
        Boolean discount;
        Boolean newsletter;
        Boolean survey;
        Boolean study;
        Boolean report;
        Boolean notification;
        Integer distance;
        Integer height;
        Integer temperature;
        Integer weight;
        u.j(accountContext, "<this>");
        u.j(accountContextJson, "accountContextJson");
        Json json = jsonParser;
        JsonElement parseToJsonElement = Json.Default.parseToJsonElement(accountContextJson);
        json.getSerializersModule();
        AccountContext accountContext2 = (AccountContext) json.decodeFromJsonElement(AccountContext.Companion.serializer(), parseToJsonElement);
        AccountContextBuilder accountContextBuilder = new AccountContextBuilder();
        Boolean discount2 = accountContext2.getSubscribed().getDiscount();
        if ((discount2 == null || accountContextBuilder.discount(discount2.booleanValue()) == null) && (discount = accountContext.getSubscribed().getDiscount()) != null) {
            accountContextBuilder.discount(discount.booleanValue());
        }
        Boolean newsletter2 = accountContext2.getSubscribed().getNewsletter();
        if ((newsletter2 == null || accountContextBuilder.newsletter(newsletter2.booleanValue()) == null) && (newsletter = accountContext.getSubscribed().getNewsletter()) != null) {
            accountContextBuilder.newsletter(newsletter.booleanValue());
        }
        Boolean survey2 = accountContext2.getSubscribed().getSurvey();
        if ((survey2 == null || accountContextBuilder.survey(survey2.booleanValue()) == null) && (survey = accountContext.getSubscribed().getSurvey()) != null) {
            accountContextBuilder.survey(survey.booleanValue());
        }
        Boolean study2 = accountContext2.getSubscribed().getStudy();
        if ((study2 == null || accountContextBuilder.study(study2.booleanValue()) == null) && (study = accountContext.getSubscribed().getStudy()) != null) {
            accountContextBuilder.study(study.booleanValue());
        }
        Boolean report2 = accountContext2.getSubscribed().getReport();
        if ((report2 == null || accountContextBuilder.report(report2.booleanValue()) == null) && (report = accountContext.getSubscribed().getReport()) != null) {
            accountContextBuilder.report(report.booleanValue());
        }
        Boolean notification2 = accountContext2.getSubscribed().getNotification();
        if ((notification2 == null || accountContextBuilder.notification(notification2.booleanValue()) == null) && (notification = accountContext.getSubscribed().getNotification()) != null) {
            accountContextBuilder.notification(notification.booleanValue());
        }
        Integer distance2 = accountContext2.getSharedUnit().getDistance();
        if ((distance2 == null || accountContextBuilder.distance(SharedUnitKt.toDistanceUnit(distance2.intValue())) == null) && (distance = accountContext.getSharedUnit().getDistance()) != null) {
            accountContextBuilder.distance(SharedUnitKt.toDistanceUnit(distance.intValue()));
        }
        Integer height2 = accountContext2.getSharedUnit().getHeight();
        if ((height2 == null || accountContextBuilder.height(SharedUnitKt.toHeightUnit(height2.intValue())) == null) && (height = accountContext.getSharedUnit().getHeight()) != null) {
            accountContextBuilder.height(SharedUnitKt.toHeightUnit(height.intValue()));
        }
        Integer temperature2 = accountContext2.getSharedUnit().getTemperature();
        if ((temperature2 == null || accountContextBuilder.temperature(SharedUnitKt.toTemperatureUnit(temperature2.intValue())) == null) && (temperature = accountContext.getSharedUnit().getTemperature()) != null) {
            accountContextBuilder.temperature(SharedUnitKt.toTemperatureUnit(temperature.intValue()));
        }
        Integer weight2 = accountContext2.getSharedUnit().getWeight();
        if ((weight2 == null || accountContextBuilder.weight(SharedUnitKt.toWeightUnit(weight2.intValue())) == null) && (weight = accountContext.getSharedUnit().getWeight()) != null) {
            accountContextBuilder.weight(SharedUnitKt.toWeightUnit(weight.intValue()));
        }
        return toJson(accountContextBuilder.build());
    }
}

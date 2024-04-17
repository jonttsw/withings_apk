package com.withings.contentproviders.eightfit.model.content;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: EightFitMeasurementContent.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/contentproviders/eightfit/model/content/EightFitMeasurementContent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "eightfit_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EightFitMeasurementContent$$serializer implements GeneratedSerializer<EightFitMeasurementContent> {
    public static final EightFitMeasurementContent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EightFitMeasurementContent$$serializer eightFitMeasurementContent$$serializer = new EightFitMeasurementContent$$serializer();
        INSTANCE = eightFitMeasurementContent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.contentproviders.eightfit.model.content.EightFitMeasurementContent", eightFitMeasurementContent$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("identifier", false);
        pluginGeneratedSerialDescriptor.addElement("tags", false);
        pluginGeneratedSerialDescriptor.addElement("titleWithDevice", false);
        pluginGeneratedSerialDescriptor.addElement("contextualizeDescriptionWithDevice", false);
        pluginGeneratedSerialDescriptor.addElement("titleForManual", false);
        pluginGeneratedSerialDescriptor.addElement("contextualizeDescriptionForManual", false);
        pluginGeneratedSerialDescriptor.addElement("featureImage", false);
        pluginGeneratedSerialDescriptor.addElement("measureType", false);
        pluginGeneratedSerialDescriptor.addElement("recommendedDevice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EightFitMeasurementContent$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] access$get$childSerializers$cp = EightFitMeasurementContent.access$get$childSerializers$cp();
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, access$get$childSerializers$cp[1], stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, IntSerializer.INSTANCE, access$get$childSerializers$cp[8]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public EightFitMeasurementContent deserialize(Decoder decoder) {
        int i11;
        List list;
        String str;
        String str2;
        int i12;
        String str3;
        List list2;
        String str4;
        String str5;
        String str6;
        char c11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        KSerializer[] access$get$childSerializers$cp = EightFitMeasurementContent.access$get$childSerializers$cp();
        int i13 = 7;
        int i14 = 6;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(descriptor2, 2);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String decodeStringElement3 = beginStructure.decodeStringElement(descriptor2, 4);
            String decodeStringElement4 = beginStructure.decodeStringElement(descriptor2, 6);
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 7);
            list = (List) beginStructure.decodeSerializableElement(descriptor2, 8, access$get$childSerializers$cp[8], null);
            str3 = decodeStringElement;
            i11 = decodeIntElement;
            str6 = decodeStringElement4;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 5, stringSerializer, null);
            str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, stringSerializer, null);
            str5 = decodeStringElement3;
            str4 = decodeStringElement2;
            i12 = 511;
            list2 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, access$get$childSerializers$cp[1], null);
        } else {
            boolean z5 = true;
            int i15 = 0;
            List list3 = null;
            String str7 = null;
            String str8 = null;
            List list4 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            int i16 = 0;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        i13 = 7;
                        i14 = 6;
                    case 0:
                        str8 = beginStructure.decodeStringElement(descriptor2, 0);
                        i16 |= 1;
                        i13 = 7;
                        i14 = 6;
                    case 1:
                        list4 = (List) beginStructure.decodeSerializableElement(descriptor2, 1, access$get$childSerializers$cp[1], list4);
                        i16 |= 2;
                        i13 = 7;
                        i14 = 6;
                    case 2:
                        c11 = 3;
                        str9 = beginStructure.decodeStringElement(descriptor2, 2);
                        i16 |= 4;
                        i13 = 7;
                    case 3:
                        c11 = 3;
                        str12 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 3, StringSerializer.INSTANCE, str12);
                        i16 |= 8;
                        i13 = 7;
                    case 4:
                        str10 = beginStructure.decodeStringElement(descriptor2, 4);
                        i16 |= 16;
                    case 5:
                        str7 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 5, StringSerializer.INSTANCE, str7);
                        i16 |= 32;
                    case 6:
                        str11 = beginStructure.decodeStringElement(descriptor2, i14);
                        i16 |= 64;
                    case 7:
                        i15 = beginStructure.decodeIntElement(descriptor2, i13);
                        i16 |= 128;
                    case 8:
                        list3 = (List) beginStructure.decodeSerializableElement(descriptor2, 8, access$get$childSerializers$cp[8], list3);
                        i16 |= 256;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i11 = i15;
            list = list3;
            str = str7;
            str2 = str12;
            i12 = i16;
            str3 = str8;
            list2 = list4;
            str4 = str9;
            str5 = str10;
            str6 = str11;
        }
        beginStructure.endStructure(descriptor2);
        return new EightFitMeasurementContent(i12, str3, list2, str4, str2, str5, str, str6, i11, list, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, EightFitMeasurementContent value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        EightFitMeasurementContent.write$Self$eightfit_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}

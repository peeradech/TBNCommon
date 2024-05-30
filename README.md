# TBNCommon
This module adds a number reusable Java methods to your project, which can be called from Microflows or custom Java actions. The module addes functionality for working with Dates, Microflows, Strings, Rules, Files, etc. See the documentation or screenshot for a complete list of functions.

## Description
This module adds a number reusable Java methods to your project, which can be called from Microflows or custom Java actions. 

The module addes functionality for working with Dates, Microflows, Strings, Rules, Files, etc. See the documentation or screenshot for a complete list of functions.
## Dependencies
**Module**
- Community Commons
- Excel importer

**Library**
- jmimemagic-0.1.0.jar
- joda-time-2.12.7.jar
  
## Function List
### Dates

*FormatDateTimeWithLocale* - Format date and time with `Locale` (e.g. Language = `th`, Country = `TH`) to a String.

*IsValidDate* - Valid date equals a your format or not.

*ParseDateTimeWithLocale* - Convert string a date time to `Date` and `Time` with `Locale`.
  
### Files

*CountLineFileExcel* - Last row contained on this sheet (0-based) or -1 if no row exists.

*HashFile* - Generate the `MD5/SHA1` checksum of a file.

*IsMatchFileType* - Validate file type, Is it match with the desirable file type.

*IsMatchMimeType* - Validate file type, Is it match from a stream of data.

*MoveFileFromS3ToLocalSystem* - Move file from `FileDocument` to `Locale Storage` with Mendix structure.

*MoveFileFromS3ToLocalSystem* - Move file from your source path to `Locale Storage` with Mendix structure.

### String

*MaskEmail* - Marking an email format.

*MaskString* - Marking a string.

### Other

*Logout* - Signout.
*LoginUser* - Create Session and add XASSESSION, XASID to cookie.

### Microflow
#### Application Version
It's about of your application information via `model/metadata.json`.

*Usage:*
- **DS_Metadata** - Will return the Metadata entity.

#### Translate Amount
This microflow translate amount to Thai wording.

*Usage:*
- **TranslateAmount** - Convert decimal to Thai wording.

#### Redirect
This microflow for redirect by http header.

### Rules
*IsThaiCitizenID* - Validate a Citizen ID of Thai.

*IsDecimal* - Validate a Decimal.

*IsEmailFormat* - Validate an Email.

*IsHexColor* - Validation a string is Hex or not.

*IsMobile* - Validate a Mobile.

*IsNumber* - Validate a 0-9.

*IsString_EN* - Validate a Character a-zA-Z0-9.

*IsString_TH* - Validate a character ก-๙0-9.




# EmailAnalysis

Analysis result for email. Each verdict property is a string PASS|FAIL|GRAY or dynamic error message
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**spamVerdict** | **String** | Verdict of spam ranking analysis |  [optional]
**virusVerdict** | **String** | Verdict of virus scan analysis |  [optional]
**spfVerdict** | **String** | Verdict of Send Policy Framework record spoofing analysis |  [optional]
**dkimVerdict** | **String** | Verdict of DomainKeys Identified Mail analysis |  [optional]
**dmarcVerdict** | **String** | Verdict of Domain-based Message Authentication Reporting and Conformance analysis |  [optional]




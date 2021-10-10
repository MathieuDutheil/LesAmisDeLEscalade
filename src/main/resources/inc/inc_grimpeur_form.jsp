<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<label for="civiliteGrimpeur">Civilite <span class="requis">*</span></label>
<select id="civiliteGrimpeur" name="civiliteGrimpeur">
    <c:forEach items="${listeCivilites}" var="civilite">
        <option value="${civilite.id}">${civilite.name}</option>
    </c:forEach>
</select>
<br/>

<label for="nomGrimpeur">Nom <span class="requis">*</span></label>
<input type="text" id="nomGrimpeur" name="nomGrimpeur" value="<c:out value="${grimpeur.nom}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['nomGrimpeur']}</span>
<br />

<label for="prenomGrimpeur">Prénom <span class="requis">*</span></label>
<input type="text" id="prenomGrimpeur" name="prenomGrimpeur" value="<c:out value="${grimpeur.prenom}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['prenomGrimpeur']}</span>
<br />

<label for="emailGrimpeur">Adresse email <span class="requis">*</span></label>
<input type="email" id="emailGrimpeur" name="emailGrimpeur" value="<c:out value="${grimpeur.email}"/>" size="30" maxlength="60" />
<span class="erreur">${form.erreurs['emailGrimpeur']}</span>
<br />

<label for="motDePasseGrimpeur">Mot de passe <span class="requis">*</span></label>
<input type="password" id="motDePasseGrimpeur" name="motDePasseGrimpeur" value="<c:out value="${grimpeur.motDePasse}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['motDePasseGrimpeur']}</span>
<br />

<label for="confirmationMotDePasseGrimpeur">Confirmation mot de passe <span class="requis">*</span></label>
<input type="password" id="confirmationMotDePasseGrimpeur" name="confirmationMotDePasseGrimpeur" value="<c:out value="${grimpeur.confirmationMotDePasse}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['confirmationMotDePasseGrimpeur']}</span>
<br />

<label for="telephoneGrimpeur">Numéro de téléphone <span class="requis">*</span></label>
<input type="text" id="telephoneGrimpeur" name="telephoneGrimpeur" value="<c:out value="${grimpeur.telephone}"/>" size="30" maxlength="30" />
<span class="erreur">${form.erreurs['telephoneGrimpeur']}</span>
<br />
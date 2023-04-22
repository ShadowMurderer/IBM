import defaultRequest from "./defaultRequest";

export const getDog = async () => {
  try {
    const response = await defaultRequest.get(
      "https://dog.ceo/api/breeds/image/random"
    );
    return response;
  } catch (error) {
    console.log(error);
    return null;
  }
};

import axios from "axios";

const get = async (url) => {
  return axios
    .get(url)
    .then((response) => {
      console.log({ response });
      return response.data;
    })
    .catch((error) => {
      console.error(error);
      throw error;
    });
};

export default {
  get,
};
